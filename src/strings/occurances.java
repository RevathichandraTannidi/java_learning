package strings;

//3) Write a Java program to count the total
//number of occurrences of a given character in a string without using any loop

public class occurances {

    public static void main(String[] args) {
        String s="hi revathiellon hei manihei";
        char occur='h';
        int count=ocurr(s,occur,0);
        System.out.println("h:"+count);

    }
    public static int ocurr(String str,char occur,int index)
    {
        if(index>= str.length())
        {
            return 0;
        }
        int count=(str.charAt(index)==occur)?1:0;
        return count+ ocurr(str,occur,index+1);



    }
}
