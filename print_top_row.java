//package twod_array;
import java.util.*;

public class print_top_row {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n :");
        int n=sc.nextInt();
        System.out.println("enter m :");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("enter array input :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("print array :");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}
