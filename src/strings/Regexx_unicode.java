package strings;

import java.util.StringTokenizer;

public class Regexx_unicode {
    public static void main(String[] args) {
        StringTokenizer s=new StringTokenizer("book is my too");

        while(s.hasMoreTokens())
        {
            String w=s.nextToken();
            System.out.print(w.charAt(0)+" ");
        }

        String s1="T revathi";
        System.out.println(s1.codePointAt(0));
        // ascii vales form the string we use the codepointAt
    }
}
