import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;
public class Nearestsmaller
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(reader.readLine());
      int[] array=new int[n];
      StringTokenizer token=new StringTokenizer(reader.readLine());
      for(int i=0;i<n;i++)
      {
         array[i]=Integer.parseInt(token.nextToken());
      }
      // monotonic stack 
      Stack<Integer> stack=new Stack<>();
       for(int i=0;i<n;i++)
       {
           while(stack.size()>0 && array[stack.peek()]>=array[i])
           {
               stack.pop();
           }
           if(stack.size()>0)
           {
               System.out.print(stack.peek()+1+" ");
           }
           else{
               System.out.print(0+" ");
           }
           stack.push(i);
        }
          
    }
}

   