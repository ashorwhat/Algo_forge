//prime number//(b)reverse//(c)Twin prime
import java.util.Scanner;
public class Task58 {
    public static boolean prime(int n){
        int f =1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                f=0;
            }
        }
        if(f==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static int rev(int n){
        int r =0;
        while(n>0){
            r = (r*10)+(n%10);
            n=n/10;
        }
        return r;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean res=prime(n);
        System.out.println(res);
         int res1 = rev(n);
        System.out.println(res1);
        res1 = rev(n);
        if(prime(n)&&prime(res1)){
            System.out.println("Twisted Prime");
        }
        else{
            System.out.println("not");
        }
    }
    
}
