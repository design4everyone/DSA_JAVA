import java.util.*;
public class Waveform_print {

    public static void waveform(int arr[][],int m,int n)
    {
       for(int i=0;i<m;i++)
       {
         if(i%2==0)
         {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
         }
         else
         {
            for(int j=n-1;j>=0;j--)
            {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();

         }
       }
    }
    public static void main(String[] args)
    {
        System.out.println("hello");
        Scanner sc=new Scanner(System.in);
        int arr[][]={{3,2,1,0},
                    {4,3,2,1},
                    {5,4,3,2},
                    {6,5,4,3}};
                    
        int m=arr.length;
        int n=arr[0].length;
        System.out.println(m);
        System.out.println(n);
       /*  System.out.println("enter arra ele :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }*/
        waveform(arr,m,n);
    }
    
}
