package strings;

import java.util.StringTokenizer;

public class vamsi {
    public static void main(String[] args) {
        String s= "im revathi";
        StringTokenizer st=new StringTokenizer(s);

    while(st.hasMoreTokens())
    {
      String ss=st.nextToken();
      String cap=ss.substring(0,1).toUpperCase() +ss.substring(1);
        System.out.println(cap+" ");


    }
    }
}
