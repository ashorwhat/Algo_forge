//find l1 and l2
import java.util.*;
public class Task50 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n =sc.nextInt();
        int[]ar = new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int l1=0;
        int l2=0;
        if(ar[0]>ar[1]){
            l1=ar[0];
            l2=ar[1];
        }
        else{
            l1=ar[1];
            l2=ar[0];
        }
        for(int i=2;i<n;i++){
            if(ar[i]>l1){
                l2=l1;
                l1=ar[i];
            }
            else if(ar[i]>l2&&l1!=ar[i]){
                l2 = ar[i];
            }
        }
        System.out.println(l1+" "+l2);
        
    }
    
}
