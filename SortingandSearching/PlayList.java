import java.util.*;
import java.io.*;
public class PlayList
{
     public static void main(String[] args) throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st=new StringTokenizer(br.readLine());
         int a=Integer.parseInt(st.nextToken());
         st=new StringTokenizer(br.readLine());
         int[] play=new int[a];
         for(int i=0;i<a;i++)
         {
             int b=Integer.parseInt(st.nextToken());
             play[i]=b;
         }
         Map<Integer,Integer> hm=new HashMap<>();
         int ans=0;
         for(int i=0,j=0;i<a;i++)
         {
            j=Math.max(hm.containsKey(play[i])?hm.get(play[i]):0,j);
            ans=Math.max(ans,i-j+1);
            hm.put(play[i],i+1);
         }
         System.out.println(ans);
      }
}