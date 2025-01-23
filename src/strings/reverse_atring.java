package strings;

public class reverse_atring {
    public static void main(String[] args) {
        String s="revathi";
        String rev="";
     for(int i =s.length() -1;i>=0;i--)
        {
        rev+=s.charAt(i);
        }
        System.out.println(rev);
    }
}
