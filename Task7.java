/*Write a program to verify if the user-inputted password matches the stored password "secure123". 
If it matches, print "Access Granted". */
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        String pass = sc.next();
        if(pass == "secure123"){
            System.out.println("Access Granted");
        }
        else{
            System.out.println("Incorrect password");
        }


        
    }
    
}
