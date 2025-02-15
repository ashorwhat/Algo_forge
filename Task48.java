//find key element
import java.util.Scanner;
public class Task48 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n =sc.nextInt();
        int[]ar = new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter key element");
        int k = sc.nextInt();
        int f =0;
        for(int i=0;i<n;i++){
            if(ar[i]==k){
                k=ar[i];
                f =1;
                break;
            }
        }
        if(f==1){
            System.out.println("key searching successful "+ k);
        }
        else{
            System.out.println("key searching unsuccessful"+ k);
        }
    }
}
