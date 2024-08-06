import java.util.*;
import java.io.*;
public class Missingnumber
{
    public static void main(String[] args) throws IOException
    {
       long n, s = 0, ele;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLong();
        for (int i = 0; i < n - 1; i++) {
            ele = scanner.nextLong();
            s += ele;
        }
        System.out.println(n * (n + 1) / 2 - s);


       /**

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] c=new int[n-1];
        for(int i=0;i<n-1;i++)
        {
           int b=Integer.parseInt(st.nextToken());
           --b;
           c[b]++;
        }int f=-1;
        for(int i=0;i<n;i++)
        {
           if(c[i]==0)
           {
               f=i+1;
               break;
           }
        }
        System.out.println(f);
        **/
        
    }
}