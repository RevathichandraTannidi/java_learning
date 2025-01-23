package strings;

class even
{
    public static void LengthEve(String s)
    {
        for(String s1:s.split(" "))
        {
            if(s1.length()%2==0)
            {
              System.out.println(s1);
            }
        }

    }
}

public class EvenLength  extends even{
    public static void main(String[] args) {
         String str="Revathi chnadra hi hlo book";
        LengthEve(str);

    }
}
