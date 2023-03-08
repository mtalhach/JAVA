package A26_Movie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        File f = new File("data.txt");
        Write fw = new Write(f);
        int ch;
        do {
            System.out.println("1 - Add movie:\n2 - Search movie:\n3 - Exit:");
            ch = inp.nextByte();
            inp.nextLine();
            System.out.println();

            if (ch == 1) {
                FileWriter fw1 = new FileWriter(f, true);
                StringBuilder str = new StringBuilder();
                System.out.println("Enter id:");
                int id = inp.nextInt();
                str.append(id);
                inp.nextLine();
                System.out.println("Enter title:");
                String tit = inp.nextLine();
                str.append("\t" + tit);
                System.out.println("Enter actor name:");
                String name = inp.nextLine();
                str.append("\t" + name);
                System.out.println("Enter release date:");
                String date = inp.nextLine();
                str.append("\t" + date);
                System.out.println("Enter The Duration:");
                int time = inp.nextInt();
                str.append("\t" + time);
                str.append("\n");
                fw1.write(str.toString());
                fw1.close();
            } else if (ch == 2) {
                fw.search();
            } else {

            }
        }while (ch!=3);
    }
}
