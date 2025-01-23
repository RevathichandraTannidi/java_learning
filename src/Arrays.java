import java.util.Scanner;

public class Arrays {

    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]= s.nextInt();

        }
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }


 // find Sum, Average, Min and Max for this array.
        int sum=0;
        for(int i=0;i<n;i++)
        {
          sum+=a[i];
        }
        System.out.println("\n"+"sum is :"+sum);


   System.out.println("average of the array is :"+ (sum/n));

   // min and max of the array
        int min=a[0];
        int max=a[0];
        for(int i=0;i<n;i++)
        {
           if (min>a[i])
           {
                    min=a[i];
           }

        }
        System.out.println(" minimum element in array : "+min);
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println(" max element in array :"+max);

    }
}
