import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a = 0;
        
        for(int i = 1;i<=n;i++){
            if(i%3==0||i%5==0){
                a =a+i;
            }
            System.out.println(a);
            
        }
    }
    
}
