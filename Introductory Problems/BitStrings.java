import java.util.*;
public class BitStrings
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       long n=sc.nextLong();
       long MOD = 1000000007;
       long num=1;
       for(int i=0;i<n;i++)
       {
          num=num*2;
          num=num % MOD;
       }
       System.out.println(num);
    }
}
       