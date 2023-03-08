package A28_FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class FileHandling {
    String data1 = "Hello This is Java code\n";
    String data2 = "This is coding World";


    public void write() {
        try {
            File f = new File("write1.txt");
            FileWriter fw = new FileWriter(f, true);
            fw.write(this.data1);
            fw.write(this.data2);
            System.out.println("File Write Successfully");
            fw.close();
        } catch (IOException var3) {
            System.out.println(var3);
        }

    }

    public void BufferedWrite() {
        String data = "Hello World";
        String data1 = "I am from Karachi";

        try {
            Writer fileWriter = new FileWriter("bufferedWriter.txt", true);
            new BufferedWriter(fileWriter);
            fileWriter.write(data);
            fileWriter.write(data1);
            fileWriter.close();
            System.out.println("Successfully Write");
        } catch (IOException var5) {
            System.out.println(var5.getMessage());
        }

    }

    public void outputStreamWriter() {
        String data = "Hello oop";
        String data1 = "I am from Sialkot";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("outputStreamWriter.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(data);
            outputStreamWriter.write(data1);
            outputStreamWriter.close();
            System.out.println("Successfully Write");
        } catch (IOException var5) {
            System.out.println(var5.getMessage());
        }

    }

    public void read() {
        char[] array = new char[10];

        try {
            Reader fileReader = new FileReader("fileWriter.txt");
            fileReader.read(array);
            System.out.println(array);
            fileReader.close();
            System.out.println("file Read Successfully");
        } catch (IOException var3) {
            System.out.println(var3.getMessage());
        }

    }
}

