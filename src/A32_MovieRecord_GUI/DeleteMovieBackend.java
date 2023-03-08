package A32_MovieRecord_GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DeleteMovieBackend {
    FileReader fr;
    BufferedReader br;
    FileWriter fw;

    public DeleteMovieBackend() {
    }

    public byte deleting(String input) throws IOException {
        this.fr = new FileReader("Movies.txt");
        this.br = new BufferedReader(this.fr);
        ArrayList movie = new ArrayList();

        String temp;
        while((temp = this.br.readLine()) != null) {
            movie.add(temp);
        }

        this.fw = new FileWriter("Movies.txt");
        byte flag = 0;
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < movie.size(); ++i) {
            String[] arr = ((String)movie.get(i)).split("_");
            if (arr[0].equals(input)) {
                flag = 1;
            } else {
                str.append((String)movie.get(i));
                str.append("\n");
            }
        }

        this.fw.write(str.toString());
        this.fw.close();
        return flag;
    }
}

