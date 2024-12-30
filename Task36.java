//Write a java program to print largest power of three less than or equal to N.

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n =sc.nextInt();
		int r=1;
		int c=0;
		while(r<=n) {
			 c=r;
			r= r*3;
		}
		System.out.println("The largest power of 3 less than or equal to " + n + " is " + c);
   
    }
    
}
