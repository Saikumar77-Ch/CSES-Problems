import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Collectingnumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] array = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(tokenizer.nextToken());
        }
        
        // System.out.println(numberOfRounds(n, array));
         System.out.println(NumberOfrounds(n,array));
    }
     public static int numberOfRounds(int n, int[] array) {
        int rounds = 0;
        int nextNumberToCollect = 1;
        
        while (nextNumberToCollect <= n) {
            rounds++;
            for (int num : array) {
                if (num == nextNumberToCollect) {
                    nextNumberToCollect++;
                }
                if (nextNumberToCollect > n) {
                    break;
                }
            }
        }
        
        return rounds;
    }
    public static int NumberOfrounds(int n,int[] array)
    {
        int[] index=new int[n+1];
        for(int i=0;i<n;i++)
        {
            index[array[i]]=i;
        }
         int rounds=1;
        for(int j=1;j<n;j++)
        { 
            if(index[j+1]<index[j])
            {
                ++rounds;
            }
        }
        return rounds;
     }         
}
