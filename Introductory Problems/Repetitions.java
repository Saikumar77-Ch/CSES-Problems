import java.util.*;
public class Repetitions
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                 count++;
                 max=Math.max(max,count);
            }else{
                 count=1;
            }
        }
        System.out.println(max==Integer.MIN_VALUE?1:max);
     }
}