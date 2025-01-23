package strings;

public class lexigrph {
    public static void main(String[] args) {

        String s1 = "Ram";
        String s2 = "Ram";
        String s3 = "Shyam";
        String s4 = "ABC";
        String s5="vamsi";
        String s6="VAMSI";

        System.out.println(" Comparing strings with compareTo:");
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//-1
        System.out.println(s1.compareTo(s4));//17
        System.out.println(s2.compareTo(s3));//-1
        System.out.println(s2.compareTo(s4));//17
        System.out.println(s3.compareTo(s4));//18
        System.out.println(s5.compareTo(s6));//32
        System.out.println(s6.compareTo(s5));//-32
    }
}
