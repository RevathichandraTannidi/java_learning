package Filehandling;

import java.io.File;
import java.io.IOException;

public class newone {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/RevathiTannidi/../src/Filehandling/output.txt");

        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Canonical Path: " + file.getCanonicalPath());
    }
}
