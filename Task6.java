 /*Write a program to input the age of a person and 
check if the age of the person is greater than or equal to 18 
then print the message: “You are eligible to cast your vote”. */
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("You are eligible to give vote");
        }
        else{
            System.out.println("tum abhi bche ho");
        }
        
    }
    
}
