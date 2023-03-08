package A33_MovieRentalStore_GUI;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    FileWriter fw;

    public Write() {
    }

    public void write(String data) throws IOException {
        this.fw = new FileWriter("Data.txt", true);
        this.fw.write(data);
        this.fw.close();
    }
}
