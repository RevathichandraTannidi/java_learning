package Filehandling;

import java.io.*;


public class ReaderExample {

    public static void main(String[] args) throws IOException {

// Using FileReader (a subclass of Reader) to read data from a file

        FileReader fileReader = new FileReader("/Users/RevathiTannidi/IdeaProjects/java_learning/src/Filehandling/reader.txt");

        int character;

        while ((character = fileReader.read()) != -1) {

            System.out.print((char) character); // Print each character

        }

        fileReader.close();

    }

}