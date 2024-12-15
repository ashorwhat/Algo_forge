 /*Write a program to calculate a 10% discount on the total bill 
if the bill exceeds ₹1000. Print the discount amount. */
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int a = sc.nextInt();
        if(a>1000){
            
            System.out.println((90*a)/100.0);
        }
        else{
            System.out.println(a);
        }

        

    }
    
}
