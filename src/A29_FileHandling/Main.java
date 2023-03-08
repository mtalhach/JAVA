package A29_FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public void writeToFile(File f) {
        try {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Input: ");
            String data = sc.nextLine();
            bw.write(data);
            System.out.println("File Write Successfully");
            bw.close();
        } catch (IOException var6) {
            System.out.println(var6);
        }

    }
}
