package strings;
import java.util.Collections;

public class palind {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("lal");
        StringBuffer st=new StringBuffer("");
       st.append(str.reverse());
        System.out.println(st);
       if((str.toString()).equals(st.toString()))
       {
           System.out.println("palidrome");
       }
       else {
           System.out.println("not palindorome");
       }


    }
}


//StringBuffer originalStr = new StringBuffer("lal");
//StringBuffer reversedStr = new StringBuffer(originalStr).reverse();
//if (originalStr.toString().equals(reversedStr.toString())) {
//        System.out.println("Palindrome");
//} else {
//        System.out.println("Not Palindrome");
//}