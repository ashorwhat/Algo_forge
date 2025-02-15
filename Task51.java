//Swap Array efficiently
import java.util.Scanner;
public class Task51 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n =sc.nextInt();
        int[]ar = new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int i=0;
        int j=ar.length-1;
        while(i<j){
            int t=ar[i];
            ar[i]=ar[j];
            ar[j]=t;
            i++;
            j--;
        }      
        for(int k=0;k<ar.length;k++){
            System.out.print(ar[k]+" ");
        }
        
    }
    
}
