import java.util.*;
import java.io.*;
public class StaticRange
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        int maxN = 200000;
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        int a, b;
        long[] x = new long[maxN + 1];
        for (int i = 1; i <= N; i++) {
            x[i] = scanner.nextLong();
            x[i] += x[i - 1];
        }
        for (int q = 0; q < Q; q++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            long c=(long)(x[b]-x[a-1]);
            System.out.println(c);
        }
        scanner.close();

    }
}