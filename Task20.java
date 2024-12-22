import java.util.Scanner;
public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int i = 1;
        int p = 1;
        while (i<=n) { 
            p=p*m;
            i++;
        }
        System.out.println(p);
        
    }
    
}
