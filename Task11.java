import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int n = sc.nextInt();
        int sign = -1;
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(sum+(sign*i));
                sign = -sign;
            }
        }
    }
    
}
