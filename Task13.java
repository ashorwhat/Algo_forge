//sumission of all odd numbers and multiplication of even numbers
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int s = 0;
        int p = 1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(p=i*p);
            }
            else{
                System.out.println(s=s+i);
            }
        }

    }
    
}
