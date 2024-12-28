//Write a java program that takes an integer N from user, uses
//Math. Random () to print N random integer numbers between 1 to N, and then prints their
//average value. Use do while loop

import java.util.Random;
import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number N");
		int N = sc.nextInt();
		int s =0;
		int C=0;
		Random rand = new Random();
		System.out.println("The random number is");
		do {
			int c = rand.nextInt(N)+1;
			System.out.println(c);
			s=s+c;
			C++;
		}
		while(C<N);
		System.out.println("the sum of numbers is "+ s);
		double avg = (double)s/C;
		System.out.println("the average is "+ avg);
		
        
    }
    
}
