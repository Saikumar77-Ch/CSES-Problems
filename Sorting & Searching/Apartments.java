import java.io.*;
import java.util.*;

public class Apartments {
	public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] input=bf.readLine().split(" ");
        String[] arr=bf.readLine().split(" ");
        String[] nums=bf.readLine().split(" ");
        int n=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);
        int k=Integer.parseInt(input[2]);
        List<Integer> array=new ArrayList<>();
        List<Integer> array1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            array.add(Integer.parseInt(arr[i]));
        }
        for(int j=0;j<m;j++)
        {
            array1.add(Integer.parseInt(nums[j]));
        }
        solver(array,array1,k);
    }
    public static void solver(List<Integer> array,List<Integer> array1,int k)
    {
        int n=array.size();
        int m=array1.size();
        Collections.sort(array);
        Collections.sort(array1);
        int i=0,j=0,ans=0;
        while(i<n && j<m)
        {
            if(Math.abs(array.get(i)-array1.get(j))<=k)
            {
                i++;
                j++;
                ans++;
            }else if(array.get(i)>array1.get(j))
            {
                j++;
            }
            else{
                i++;
            }
        }
        System.out.println(ans);
    }
}