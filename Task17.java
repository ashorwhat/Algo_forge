import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entera number");
        int n = sc.nextInt();
        int r = 0;
        int t =0;
        while(n>0){
            r = (r*10)+(n%10);
            n = n/10;
        }
        System.out.println(r);
        if(t==r){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        
        
    }
    
}
