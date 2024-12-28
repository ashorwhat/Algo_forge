//Write a Java program to check if a number is perfect number or not.
//(Hints: A number N is called perfect number, if the sum of factors except N as a factor is
//equals to the number N

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number n");
		int n = sc.nextInt();
		int s =0;
		int f =0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0){
				f=i;
				s=s+i;	
			}
			
		}
		System.out.println("the sum of numbers is "+ s);
		if(n==s) {
			System.out.println("The number is perfect ");
		}
		else {
			System.out.println("Not a perfect number");
		}
		

        
    }
    
}
