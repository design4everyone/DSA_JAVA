import java.util.*;
public class print_left_most
{
    public static void main(String[] args)
    {
        System.out.println("hello world");
        Scanner sc=new Scanner(System.in);
        int m=3;
        int n=3;
        int[][] arr=new int[m][n];
        System.out.println("enter array inputs :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();      
            
            }
        }
        System.out.println("print left most column :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<=0;j++)
            {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
        }
    }
    
}
