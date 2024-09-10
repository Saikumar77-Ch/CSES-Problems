import java.util.*;
public class Missingcoinsum
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       long[] arr=new long[n];
       for(int i=0;i<n;i++)
       {
          arr[i]=sc.nextLong();
       }
       long number=1;
       long f=-1;
       Arrays.sort(arr);
       for(int i=0;i<n;i++)
       {
          if(arr[i]>number)
          {
             f=number;
             break;
          }
          number+=arr[i];
       }
       System.out.println(f==-1?number:f);
   }
}
