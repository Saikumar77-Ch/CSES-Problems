import java.util.*;
import java.io.*;
public class TwoSum
{ 
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] input=bf.readLine().split(" ");
        String[] arr=bf.readLine().split(" ");
        int n=Integer.parseInt(input[0]);
        int x=Integer.parseInt(input[1]);
        Map<Integer, Integer> map = new HashMap<>();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            int num=Integer.parseInt(arr[i]);
            int complement = x - num;
            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " " + (i+1));
                flag = false;
                break;
            }
            else{
                map.put(num,i+1);
            }
        }
        
        if (flag) {
            System.out.println("IMPOSSIBLE");
        }
    }
}