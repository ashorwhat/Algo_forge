/*Write a program that takes a number as input and prints its multiplication table 
up to 10 using a loop.*/
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
        
    }
    
}
