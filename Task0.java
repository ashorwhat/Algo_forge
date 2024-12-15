import java.util.Scanner;
public class Task0 {
    public static void main(String[] args) {
        /*Write a program to check if a person is a senior citizen. 
A person is considered a senior citizen if their age is 60 or above. 
If the condition is met, print "Senior Citizen". */
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age");
int age = sc.nextInt();
if(age>=60){
    System.out.println("Senior Citizen");
}



    }
    
}
