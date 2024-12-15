/*WAP to find the product of all natural numbers between 0 to n*/
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int n = sc.nextInt();
        double prod =1;
        for(int i=1;i<=n;i++){
            prod = prod*i;

        }
        System.out.println(prod);
    }
    
}
