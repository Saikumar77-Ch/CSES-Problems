import java.util.*;
import java.io.*;
public class TasksandDeadlines
{
   public static void main(String[] args) throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       Task[] tasks=new Task[n];
       for(int i=0;i<n;i++)
       {
          StringTokenizer st=new StringTokenizer(br.readLine());
          int duration=Integer.parseInt(st.nextToken());
          int deadline=Integer.parseInt(st.nextToken());
          tasks[i]=new Task(duration,deadline);
       }
       Arrays.sort(tasks, (a,b) -> a.duration-b.duration);
       long time=0;
       long reward=0;
       for(Task task:tasks)
       {
          time+=task.duration;
          reward+=task.deadline-time;
       }System.out.println(reward);
    }
}
class Task
{
    int duration;
    int deadline;
    Task(int duration,int deadline)
    {
        this.duration=duration;
        this.deadline=deadline;
    }
}


