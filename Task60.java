
import java.util.Scanner;

public class Task60 {
    public static int fact(int n){
        int p=1;
        if(n==0){
            return 1;
            }
            for(int i=1;i<=n;i++){
                p=p*i;
            }
        return p;
    
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(i+"!="+fact(i));
        }
    }
    
}
