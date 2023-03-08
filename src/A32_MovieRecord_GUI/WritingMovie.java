package A32_MovieRecord_GUI;

import java.io.FileWriter;
import java.io.IOException;

public class WritingMovie {
    FileWriter fw;

    public WritingMovie() {
    }

    public void write(String movie) throws IOException {
        this.fw = new FileWriter("Movies.txt", true);
        this.fw.write(movie);
        this.fw.close();
    }
}

