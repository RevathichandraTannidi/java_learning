package strings;
import java.util.*;

public class GeeksforGeeks1 {
    public static void main(String[] args) {
        String s1="revathi";
        String s2="revathi";
        String s3=new String("chandrarevathi chandra");
        System.out.println("length "+s1.length());
        System.out.println("char at "+s1.charAt(3));
        System.out.println("substring "+s1.substring(2));
        System.out.println("substring index to index " +s1.substring(2,6));//6-1
        System.out.println("contains data  "+s1.contains(s2));
        System.out.println("equals of data "+s1.equals(s2));
        System.out.println("equals of data "+s1.equals(s3));
        System.out.println("compare to of the data lexiographical "+s1.compareTo(s3));
        System.out.println("index of data "+s1.indexOf(s1));
        System.out.println("index of data "+s1.indexOf(s3,1));

    }
}
