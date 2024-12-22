//WAP to check whwther a num is perfect or not
import java.util.Scanner;
public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int s = 0;
        for(int i=1;i<=n/2;i++) { 
            if(n%i==0){
                s=s+i;
            }
        }
            if(n==s){
                System.out.println("Number is perfect");
            }
            else{
                System.out.println("Number is not a perfect");
            }
        

        
    }
    
}
