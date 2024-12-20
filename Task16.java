import java.util.Scanner;
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n");
        int n = sc.nextInt();
        int s = 0;
        int c = 0;
        while(n>0){
            s = s+(n%10);
            n = n/10;
             c++;
        }
        double avg = (double)s/c;
        System.out.println(s);
        System.out.println(avg);
        
    }
    
}
