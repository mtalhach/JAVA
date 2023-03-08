package A33_MovieRentalStore_GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Search {
    FileReader fr;

    public Search() {
    }

    public String search(String input) throws IOException {
        this.fr = new FileReader("Data.txt");
        BufferedReader br = new BufferedReader(this.fr);
        ArrayList<String> data = new ArrayList();
        StringBuilder str = new StringBuilder();

        String temp;
        while((temp = br.readLine()) != null) {
            data.add(temp);
        }

        for(int i = 0; i < data.size(); ++i) {
            if (((String)data.get(i)).contains(input)) {
                String[] tmp = ((String)data.get(i)).split("_");
                String[] var8 = tmp;
                int var9 = tmp.length;

                for(int var10 = 0; var10 < var9; ++var10) {
                    String e = var8[var10];
                    str.append(e);
                    str.append("\t\t\t");
                }

                System.out.println(str);
            }
        }

        this.fr.close();
        br.close();
        return str.toString();
    }
}

