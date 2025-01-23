package strings;

import java.util.Arrays;

public class sortString {
    public static void main(String[] args) {
        String s="revathi";
        System.out.println("normal string:"+s);
        char []ch=s.toCharArray();
//        Arrays.sort(ch);
//        System.out.println(ch);

        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch.length -i-1;j++)
            {
                if(ch[j]>ch[j+1])
                {
                    char temp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                }
            }

        }
        System.out.println(ch);
        System.out.println("after sorting the character array :"+ ch);
        System.out.println("after converting char array to string:"+Arrays.toString(ch));


    }
}
