import java.util.*;
public class Threesum
{
   public static void main(String[] args)
   { 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      } 
      List<int[]> nums=new ArrayList<int[]>();
      for(int i=0;i<n;i++)
      {
         nums.add(new int[] {arr[i],i+1});
      }
      Collections.sort(nums, Comparator.comparingInt(a -> a[0]));
      for(int i=0;i<n-2;i++)
      {
         int j=i+1;
         int k=n-1;
         while(j<k)
         {
            int sum=nums.get(i)[0]+nums.get(j)[0]+nums.get(k)[0];
            if(sum==x)
            {
               System.out.println(nums.get(i)[1]+" "+nums.get(j)[1]+" "+nums.get(k)[1]);
               return;
            }else if(sum>x)
            {
               --k;
            }else{
                ++j;
            }
         }
       }System.out.println("IMPOSSIBLE");
      
    }

}