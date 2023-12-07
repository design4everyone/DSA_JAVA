public class Row_wise_sum {

    public static int[] Rowsum(int arr[][],int m,int n)
    {
       int anss[]=new int[m];
       for(int i=0;i<m;i++)
       {
        int sum=0;
        for(int j=0;j<n;j++)
        {
            sum=sum+arr[i][j];
        }
        anss[i]=sum;
       }
       return anss;
    }

    public static void main(String[] args)
    {
        System.out.println("hello");
        int arr[][]={
                    {3,2,1,0},
                    {4,3,2,1},
                    {5,4,3,2},
                    };
        int m=arr.length;
        int n=arr[0].length;
        System.out.print("printing array :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              System.out.print(arr[i][j]);
              System.out.print(" ");
            }
            System.out.println();
        }
        
       int[] ans=Rowsum(arr,m,n);
        System.out.print("sum is :");
        for(int i=0;i<m;i++)
        {
            System.out.print(ans[i]);
            System.out.print(" ");
        }
        

    
    
    }
    
}
