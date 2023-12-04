//package twod_array;
//given a matrix of N*N print its top row
import java.util.*;

public class print_top_row_1 {
    public static void main(String[] args)
    {
       System.out.println("hello world");
       Scanner sc=new Scanner(System.in);
       System.out.println("enetr n :");
       int n=sc.nextInt();
       int arr[][]=new int[n][n];
       System.out.println("enter array :");
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=sc.nextInt();
        }
       }

       System.out.println("top row :");
       for(int i=0;i<1;i++)
       {
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[i][j]);
            System.out.print(" ");
        }
       }

    }

    
}
