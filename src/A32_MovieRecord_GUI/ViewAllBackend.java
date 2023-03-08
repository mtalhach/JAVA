package A32_MovieRecord_GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ViewAllBackend {
    FileReader fr;

    public ViewAllBackend() {
    }

    public String[][] viewAll() throws IOException {
        this.fr = new FileReader("Movies.txt");
        BufferedReader br = new BufferedReader(this.fr);
        ArrayList movie = new ArrayList();

        String temp;
        while((temp = br.readLine()) != null) {
            movie.add(temp);
        }

        String[][] movies = new String[movie.size()][];

        for(int i = 0; i < movie.size(); ++i) {
            String[] tempM = ((String)movie.get(i)).split("_");
            movies[i] = tempM;
        }

        return movies;
    }
}
