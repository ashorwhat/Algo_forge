//Write a program that generates a random integer number between 1 to 10 and asks the user to
//guess what the number is. If the user's guess is higher than the random number, the program
//should display "Too high, try again." If the user's guess is lower than the random number, the
//program should display "Too low, try again." The program should use a loop that repeats until
//the user correctly guesses the random number and display good guess.

import java.util.Random;
import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Random rand = new Random();
		int c = rand.nextInt(10)+1;
		System.out.println("The random number is "+ c);
		Scanner sc =new Scanner(System.in);
		int n =0;
		 while(c!=n) {
				 n =sc.nextInt();
		 if(c<n) {
			 System.out.println("Too high, try again.");
		 }
		 else if(c>n) {
			 System.out.println( "Too low, try again." );
		 }
		 else {
			 System.out.println("good guess.");
		 }
	 }
       
    }
    
}
