package strings;

public class charduplicate {
    public static void main(String[] args) {
        String s="rtevaathevri";
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(c[i]==c[j])
                {
                    System.out.println(c[j]+" ");
                    break;
                }
            }
        }
    }
}
