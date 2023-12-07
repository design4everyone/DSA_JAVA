import java.util.*;
public class sum_of_ele_twod {
    public static void main(String[] args)
    {
        System.out.println("hello");
        int m=3;
        int n=3;
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[m][n];
        int sum=0;
        System.out.println("enter array ele :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum of ele :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum=sum+arr[i][j];
            }
        }
        System.out.println("Sum is :"+sum);

    }
    
}
