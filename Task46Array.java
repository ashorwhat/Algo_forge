import java.util.Scanner;
public class Task46Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of araay");
        int n = sc.nextInt();
        int []ar = new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();//Enter values in an Array
        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");

        }   
    }   
}
    

