import java.util.*;
public class FourSum
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      long x=sc.nextLong();
      long[] arr=new long[n];
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextLong();
      }
      List<long[]> list=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
         list.add(new long[]{arr[i],(long)i+1});
      }
      Collections.sort(list, Comparator.comparingLong(a -> a[0]));
      int f=0;
      for(int i=0;i<n-3;i++)
      {
         for(int j=i+1;j<n-2;j++)
         {
             int k=j+1;
             int l=n-1;
             while(k<l)
             {
                 long sum=list.get(i)[0]+list.get(j)[0]+list.get(k)[0]+list.get(l)[0];
                 if(sum==x)
                 {
                      System.out.println(list.get(i)[1]+" "+list.get(j)[1]+" "+list.get(k)[1]+" "+list.get(l)[1]);
                      f=1;  
                      return;    
                 }else if(sum>x)
                 {
                     l--;
                 }else{
                     ++k;
                 }
              }
          }
      }
      if(f==0) System.out.println("IMPOSSIBLE");
   }
}
