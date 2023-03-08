package A29_FileHandling;

import java.io.File;

public class Demo {


    public static void main(String[] args) {
        File f = new File("write2.txt");
        Main main = new Main();
        main.writeToFile(f);
    }
}

