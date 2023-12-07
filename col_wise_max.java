public class col_wise_max {
    public static int[] col_wise(int arr[][],int m,int n)
    {
        int[] anss = new int[n];
        for(int j=0;j<n;j++)
        {
            int max=arr[0][j];
            for(int i=0;i<m;i++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
            anss[j]=max;
        }
        return anss;
    }
    public static void main(String[] args)
    {
        int arr[][]={
            {3,2,1,0},
            {4,3,2,1},
            {5,4,3,2}
                   };
        int m=arr.length;
        int n=arr[0].length;
        int[] ans=col_wise(arr,m,n);
        System.out.println("max ele :");
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]);
            System.out.print(" ");
        }

       
       
       
     }
    
}
