package A25_Exception_Error;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class FileHandling {
    File f;
    FileReader fr;
    BufferedReader br;
    FileHandling(File f){
        this.f=f;
        try{
            fr=new FileReader(f);
            br=new BufferedReader(fr);
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public StringBuilder readFromFile(){
        String temp="";
        StringBuilder s=new StringBuilder();
        try{
            while ((temp=br.readLine())!=null){
                s.append(temp);
                //s.append("%n");
            }
        }
        catch (IOException e){

        }
        return s;
    }

    public String[] countWords(){
        String temp=readFromFile().toString();
        return temp.split(" ");
    }


    public String[] getUniqueWords() {
        String temp = readFromFile().toString();
        Set set = new HashSet();
        /*
        set.add();
        */
        return null;
    }

}