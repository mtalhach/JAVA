package A32_MovieRecord_GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SearchMovieBackend {
    FileReader fr;

    public SearchMovieBackend() {
    }

    public String search(String input) throws IOException {
        this.fr = new FileReader("Movies.txt");
        BufferedReader br = new BufferedReader(this.fr);
        ArrayList movie = new ArrayList();

        String temp;
        while((temp = br.readLine()) != null) {
            movie.add(temp);
        }

        String st = "";

        for(int i = 0; i < movie.size(); ++i) {
            if (((String)movie.get(i)).contains(input)) {
                st = (String)movie.get(i);
            }
        }

        return st;
    }
}

