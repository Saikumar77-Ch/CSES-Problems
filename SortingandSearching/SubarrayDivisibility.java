import java.util.*;
import java.io.*;
public class SubarrayDivisibility
{
   public static void main(String[] args) throws IOException
   {
     Scanner in = new Scanner (System.in);
     int N = in.nextInt();

		/*
		 *  (a - b) mod N = a mod N - b mod N -> if a = b, subset is divisible.
		 */

     int [] prefix = new int [N];
     prefix [0] = 1;
     int prefixsum = 0;
     long count = 0;
     for (int a = 0; a < N; a++) {
         prefixsum = (prefixsum + in.nextInt())%N;
	 if (prefixsum < 0) {
		prefixsum += N;
	  }
			
	  count += prefix [prefixsum];
          prefix [prefixsum]++;
     }
     /**
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
      int a=Integer.parseInt(st.nextToken());
      int[] array=new int[a];
      st=new StringTokenizer(br.readLine());
      for(int i=0;i<a;i++)
      {
          array[i]=Integer.parseInt(st.nextToken());
      }
      Map<Integer,Integer> hm=new HashMap<>();
      hm.put(0,1);
      long count=0; 
      int prefixsum=0;
      for(int i=0;i<array.length;i++)
      {
          prefixsum+=array[i]%a;
          if(prefixsum<0) prefixsum+=a;
          count+=hm.getOrDefault(prefixsum,0);
          hm.put(prefixsum,hm.getOrDefault(prefixsum,0)+1);
      }
    **/
      System.out.println(count);

    }
}