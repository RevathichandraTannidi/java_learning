package strings;
//Java Program to Reverse a String using Stack
import java.util.Collections;
import java.util.Stack;

public class reverstack {
    public static void main(String[] args) {
        String str="revathi";
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            st.push(str.charAt(i));
        }
      //  System.out.println(st);

       String s="";
int n=st.size();
      //  System.out.println(n);


        for(int i=0;i<n;i++)
        {
            s+=st.pop();

        }

        String s1="manoj";
        System.out.println(s1);
        Stack<Character> stack =new Stack<Character>();

        for(char c:s1.toCharArray())
        {
            stack.push(c);
        }
        StringBuilder s3= new StringBuilder();
     while(!stack.isEmpty())
     {
       s3.append(stack.pop());
     }
        System.out.println(s3);


      //  st.stream().peek(x->System.out.println(x));

        //System.out.println(s);
    }
}

