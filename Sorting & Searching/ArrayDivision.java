import java.util.*;
public class ArrayDivision
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextLong();
        }
        long sum=0; 
        for(long i:arr) sum+=i;
        long low=Long.MIN_VALUE;
        for(long i:arr) low=Math.max(low,i);
        long high=sum;
        long res=0;
        while(low<=high)
        {
            long mid=(low+high)/2;
            if(check(arr,k,mid))
            {
               res=mid;
               high=mid-1;
            }else{
               low=mid+1;
            }
         }
        System.out.println(res);
     }
     public static boolean check(long[] arr,int k,long mid)
     {
         long sum=0;
         int valid_partitions=1;
         for(int i=0;i<arr.length;i++)
         {
             sum+=arr[i];
             if(sum>mid)
             {
                sum=arr[i];
                valid_partitions++;
             }
          }return valid_partitions<=k;
      }
}
            
        