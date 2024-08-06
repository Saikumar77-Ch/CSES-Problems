import java.util.*;
import java.io.*;
public class Restaurant
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            tm.put(Integer.parseInt(st.nextToken()),1);
            tm.put(Integer.parseInt(st.nextToken()),-1);

        }
        int max=0;
        int curr=0;
        for(int t:tm.values())
        {
            curr+=t;
            max=Math.max(max,curr);
        }
        System.out.println(max);
    }
}