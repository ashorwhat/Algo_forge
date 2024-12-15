import java.util.Scanner;
public class Task1 {
    //Write a program that takes an integer input and prints whether the number is even or odd.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("The number is even ");
        }
        else{
            System.out.println("The number is odd");
        }

    }
    
}
