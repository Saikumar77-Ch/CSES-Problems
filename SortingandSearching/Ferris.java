import java.util.*;
import java.io.*;
public class Ferris
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.nextLine();

		// Read in weights of children (this optimization is necessary to pass
		// all test cases)
		String[] weightsStr = sc.nextLine().split(" ");
		// weights is of type Integer to prevent having to cast the result from
		// Integer.parseInt() to an int, saving time (part of optimization)
		Integer[] weights = new Integer[n];
		for (int i = 0; i < n; i++) {
			weights[i] = Integer.parseInt(weightsStr[i]);
		}
		Arrays.sort(weights);
        int ans=0;
        int i=0,j=n-1;
        while(i<=j)
        {
            if(weights[i]+weights[j]<=x)
            {
                i++;
                j--;
                ans++;
            }
            else{
                j--;
                ans++;
            }
        }
        System.out.println(ans);
    }
}