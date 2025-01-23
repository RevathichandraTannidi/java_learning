package strings;

public class Panagram {
    public static boolean ispanagarm(String str)
    {
        str=str.toLowerCase();
        for(char c = 'a'; c < 'z'; c++)
        {
if(!str.contains(String.valueOf(c)))
{
    return false;
}
        }


        return true;
    }

    public static void main(String[] args) {

        String str=" the quick brwon fox jumps over the lazy dog";
        String str1="tdsdriukodamp,sJDEHWFHwkjafrgyrj";
        System.out.println(ispanagarm(str));
        System.out.println(ispanagarm(str1));


    }
}
