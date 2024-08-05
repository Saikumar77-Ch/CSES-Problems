import java.util.*;
import java.io.*;
public class Distinict
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());
        long[] nums=new long[a];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++)
        {
            nums[i]=Long.parseLong(st.nextToken());
        }
        int count=0;
        int left=0;
        long result=0;
        Map<Long,Long> hm=new HashMap<>();
        for(int right=0;right<nums.length;right++)
        {
            hm.put(nums[right],(long)hm.getOrDefault(nums[right],(long)0)+1);
            while(hm.size()>x)
            {
                hm.put(nums[left],(long)hm.get(nums[left])-1);
                if(hm.get(nums[left])==0)
                {
                    hm.remove(nums[left]);
                }
                left++;
            }result+=right-left+1;

        }
        System.out.println(result);
        
    }
}