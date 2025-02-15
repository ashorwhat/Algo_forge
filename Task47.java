//Max inan array
import java.util.Scanner ;
public class Task47 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n =sc.nextInt();
        int[]ar = new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int max =ar[0];
        for(int i=1;i<n;i++){
            if(max<ar[i]){
                max = ar[i];     
           }
        }
        System.out.println(max);
    }
    
}
