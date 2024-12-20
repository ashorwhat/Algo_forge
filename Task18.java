import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int s = 0;
        int t =n;
        while(n>0){
            s = s+(n%10);
            n = n/10;           
        }
        System.out.println(s);
        if(s%9==0){
            System.out.println("yes,the number " + t +" is divisble by 9");
        }
        else{
            System.out.println("No,the number " + t +" is not divisble by 9");
            
        }
    }
    
}
