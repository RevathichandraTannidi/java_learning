package Filehandling;

import java.io.*;

public class filewriter {

    public static void main(String[] args) throws IOException {

// Writing data to a file
       // "C:\Users\RevathiTannidi\IdeaProjects\java_learning\src\Filehandling\file.txt"
        FileWriter writer = new FileWriter("/Users/RevathiTannidi/IdeaProjects/java_learning/src/Filehandling/file.txt");

        writer.write("Hello, Java IO file writer");

        writer.close();


// Reading data from a file

        FileReader reader = new FileReader("/Users/RevathiTannidi/IdeaProjects/java_learning/src/Filehandling/file.txt");

        int data = reader.read();

        while (data != -1) {

            System.out.print((char) data);

            data = reader.read();

        }

        reader.close();

    }

}
