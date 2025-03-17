package Filehandling;
import java.io.*;
import java.util.Scanner;
public class  delete {
    public static void main(String[] args) throws IOException {
        File fl=new File("/Users/RevathiTannidi/IdeaProjects/java_learning/src/Filehandling/book.txt");
        System.out.println(fl.getAbsolutePath());
        System.out.println(fl.getName());
        System.out.println(fl.getAbsoluteFile());
        System.out.println(fl.getCanonicalPath());
        System.out.println(fl.getCanonicalFile());
        System.out.println(fl.getParentFile());
        System.out.println(fl.getPath());
        System.out.println(fl.canRead());
        try {
            if (fl.delete()) {
                System.out.println("successfully deleted "+fl.getName());
            } else {
                System.out.println("failed yo delete");
            }
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }

    }
}
