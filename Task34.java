//Write a java program to enter two numbers through the keyboard. Write a program to find the
//value of one number raised to the power of another. (Do not use Java built-in method).

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int m = sc.nextInt();
		int n = sc .nextInt();
		int p=1;
		for(int i=1;i<=n;i++) {
			p=p*m;
		}
		System.out.println("the ans is "+ p);
			


        
    }
    
}
