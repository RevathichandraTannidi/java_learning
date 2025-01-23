package Filehandling;
import java.io.*;
import java.util.Scanner;
public class  delete {
    public static void main(String[] args) {
        File fl=new File("/Users/RevathiTannidi/IdeaProjects/java_learning/src/Filehandling/book.txt");
        try {
            if (fl.delete()) {
                System.out.println("succesfully deleted "+fl.getName());
            } else {
                System.out.println("failed yo delete");
            }
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }

    }
}
