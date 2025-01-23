import java.sql.SQLOutput;
import java.util.*;
public class D2Array {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("rows :");
        int row=sc.nextInt();
        System.out.print("columns:");
        int col=sc.nextInt();
        int [][]a= new int[row][col];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            System.out.println();
            for (int j=0;j<col;j++)
            {
System.out.print(a[i][j]+" ");
            }
        }
        System.out.println("\n");
        // mirror of the array
//        1 2 3       3 2 1
//        4 5 6       6 5 4
//        7 8 9       9 8 7
int a1[][]=new int[row][col];

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {

                a1[i][j]=a[i][col-1-j];
            }
        }


        System.out.println("\n mirror matrix");
        for (int i=0;i<row;i++)
        {
            System.out.println();
            for (int j=0;j<col;j++)
            {
System.out.print( a1[i][j]+" ");
            }
        }

    }
}
