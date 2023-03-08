package A37_GUI;

import java.io.FileWriter;
import java.io.IOException;

public class WritingData {
    FileWriter fw;

    public WritingData() {
    }

    public void write(String Add) throws IOException {
        this.fw = new FileWriter("Data.txt", true);
        this.fw.write(Add);
        this.fw.close();
    }
}

