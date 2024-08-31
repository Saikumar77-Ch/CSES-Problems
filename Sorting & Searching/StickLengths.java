import java.io.*;
import java.util.*;
public class StickLengths
{
   public static void main(String[] args) throws IOException
   {
      /** Brute force approach T.C: O(max*n);
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sticks = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sticks[i] = scanner.nextInt();
            min = Math.min(min, sticks[i]);
            max = Math.max(max, sticks[i]);
        }
        int minCost = Integer.MAX_VALUE;
        for (int i= min; targetLength <= max; targetLength++) {
            int Cost = 0;
            for (int stick : sticks) {
                currentCost += Math.abs(stick - targetLength);
            }
            minCost = Math.min(minCost, Cost);
        }
        System.out.println(minCost);
       **/
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] sticks=new int[n];
       for(int i=0;i<n;i++)
       {
          sticks[i]=sc.nextInt();
       } 
       Arrays.sort(sticks);
       long sum=0;
       for(int i=0;i<n;i++)
       {
           sum+=Math.abs(sticks[i]-sticks[n/2]);
       }
       System.out.println(sum);
    }
}
       