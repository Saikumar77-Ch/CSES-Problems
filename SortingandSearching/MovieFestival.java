import java.util.*;
import java.io.*;
class Interval
{
    long start;
    long end;
    Interval(long start,long end)
    {
        this.start=start;
        this.end=end;
    }
}
public class MovieFestival {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a=Integer.parseInt(br.readLine().trim());
        Interval[] intervals=new Interval[a];
        while(a-->0)
        {
            st=new StringTokenizer(br.readLine());
            long start=Long.parseLong(st.nextToken());
            long end=Long.parseLong(st.nextToken());
            intervals[a]=new Interval(start,end);
        }
        Arrays.sort(intervals,(s,e) -> Long.compare(s.end,e.end));
        long count=1;
        long eTime=intervals[0].end;
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i].start>=eTime)
            {
                ++count;
                eTime=intervals[i].end;
            }
        }
        System.out.println(count);
    }
}
