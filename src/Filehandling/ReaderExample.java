package Filehandling;

import java.io.*;


public class ReaderExample {

    public static void main(String[] args) throws IOException {

// Using FileReader (a subclass of Reader) to read data from a file

       FileReader fr=new FileReader("/Users/RevathiTannidi/IdeaProjects/java_learning/src/Filehandling/output.txt");
       BufferedReader br=new BufferedReader(fr);
       int lines=0;
       int word=0;
       int characters=0;
       try
       {
           String line;
           while((line=br.readLine())!=null){
               lines++;
               characters+=line.length();
               String[] words = line.split("\\s+");
               word += words.length;
           }
           System.out.println(lines);
           System.out.println(characters);
           System.out.println(word);
       }

        catch (Exception e) {
           throw new RuntimeException(e);
       }
    }

}