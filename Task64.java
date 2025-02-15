//WAP to enter the first number and second number. Display the prime numbers between the
//first and second number.
import java.util.Scanner;
public class Task64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        int res2 = (int)Math.max(n1,n2);
        int res1 = (int)Math.min(n1,n2);
        int f=0;
        for(int i=res1;i<=res2;i++){
            for(int j=2;j<=i/2;j++){   
                if(i%j==0){
                f=1;
                break;
                }
            }
                if(f==0){
                    System.out.println(i);
                }
            
        }

        
    }
    
}
