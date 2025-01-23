package Filehandling;
import java.io.*;
import java.util.Scanner;

public class ReadTheFile {
    public static void main(String[] args) {
        try
        {
            FileReader read =new FileReader("/Users/RevathiTannidi/IdeaProjects/java_learning/src/Filehandling/run.txt");
            Scanner sc=new Scanner(read);  // used to read the data from the file of line by line
            while(sc.hasNextLine())
            {
                String s=sc.nextLine();
                System.out.println(s);
            }
            System.out.println("file succesfully read");
            sc.close();
  
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
