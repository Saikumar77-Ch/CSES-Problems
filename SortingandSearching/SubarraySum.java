import java.util.*;
import java.io.*;
public class SubarraySum
{
   public static void main(String[] args) throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());
       st = new StringTokenizer(br.readLine());
       int[] array=new int[a];
       for(int i=0;i<a;i++)
       {
           array[i]=Integer.parseInt(st.nextToken());
       }
       // sliding window approach
       long sum=0;
       int j=0,i=0,count=0;
       while(i<a)
       {
           sum+=array[i];
           while(sum>=b)
           {
              if(sum==b) ++count;
              sum-=array[j];
              ++j;
           }++i;
       }
       System.out.println(count);
       /** 
        // PrefixSum + HashMap
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());
       st = new StringTokenizer(br.readLine());
       int[] array=new int[a];
       for(int i=0;i<a;i++)
       {
           array[i]=Integer.parseInt(st.nextToken());
       }
       Map<Long,Integer> hm=new HashMap<>();
       long count=0,pre=0;
       hm.put(0L,1);
       for(int i=0;i<array.length;i++)
       {
           pre+=array[i];
           if(hm.containsKey(pre-b))
           {
              count+=hm.get(pre-b);
           }
           hm.put(pre,hm.getOrDefault(pre,0)+1);
       }
       System.out.println(count);
       **/

    }
}
   