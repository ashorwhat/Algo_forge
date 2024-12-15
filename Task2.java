import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && a>=c  ){
            System.out.println("The greeatest num is" + a);
        }
        else if(a<=b && b>=c){
            System.out.println("The greatest num is" +b);
        }
        else{
            System.out.println("The greatest num is" +c);
            
        }


        
    }
    
}
