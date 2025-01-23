package strings;

public class leaingzeros
{
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder("10480280");
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++) {
         if(s.charAt(i)!='0')
         {
            s1.append(s.charAt(i));
         }
        }
        System.out.println(s1);

    }
}
