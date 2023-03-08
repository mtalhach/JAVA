package A26_Movie;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
public class Write {
    Scanner inp = new Scanner(System.in);
    File f;

    public Write(File f) {
        this.f = f;
    }
    public void search()throws IOException {
        FileReader fr = new FileReader(f);
        ArrayList<String> data= new ArrayList<>();
        String temp;
        BufferedReader br = new BufferedReader(fr);
        while((temp = br.readLine()) != null){
            data.add(temp);
        }

        System.out.println("Search by title, name or id....");
        String sr = inp.nextLine();
        System.out.println("id\ttitle\tactor name\trelease date");
        for (int i = 0;i<data.size();i++){
            if(data.get(i).contains(sr)){
                System.out.println(data.get(i));
            }
        }
        fr.close();
        br.close();
    }
}
