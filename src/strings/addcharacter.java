package strings;


public class addcharacter {
    public static void main(String[] args) {
        String s="i revathi";
        System.out.println(s);
        System.out.println(addchar(s,'m',1));

    }

    public static String addchar(String s, char c, int i)
    {
        StringBuffer sb=new StringBuffer(s);
        sb.insert(i,c);
        return sb.toString();

    }
}
