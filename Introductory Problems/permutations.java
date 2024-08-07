import java.util.*;
public class permutations {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    //int k=0;
    if(n==2 || n==3){
        System.out.println("NO SOLUTION");
    }
    else if(n==4){
        for(int i=0;i<n;i++){
            if(i==0)
                arr[i]=n/2;
            else if(i==n/2)
                arr[i]=1;
            else
                arr[i]=arr[i-1]+2;
            System.out.println(arr[i]);
        }
    }
    else{
        // if(n%2==0)
        //     k=n/2;
        // else
        //     k=n/2+1;
        // for(int i=0;i<n;i++){
        //     if(i==0)
        //         arr[i]=1;
        //     else if(i==k)
        //         arr[i]=2;
        //     else
        //         arr[i]=arr[i-1]+2;
        //     System.out.println(arr[i]);
        // }

        List<Integer> result = new ArrayList<>();
            
            // Add all odd numbers first
            for (int i = 1; i <= n; i += 2) {
                result.add(i);
            }

            // Add all even numbers
            for (int i = 2; i <= n; i += 2) {
                result.add(i);
            }

            // Print the result
            for (int i = 0; i < result.size(); i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(result.get(i));
            }
    }
}
    
}
