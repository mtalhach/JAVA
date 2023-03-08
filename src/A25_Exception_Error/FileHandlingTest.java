package A25_Exception_Error;

import java.io.File;

public class FileHandlingTest {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Muhammad Talha\\Desktop\\OOP\\HFC.txt");
        FileHandling fh=new FileHandling(f);
//        System.out.println(fh.readFromFile());

        String arrayOfWords[]=fh.countWords();
//        System.out.println(fh.countWords().length);

        for(String t:arrayOfWords)
            System.out.println(t);


    }
}