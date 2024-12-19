//Write a program to find the result of following series up to n ((1^2+2^2+3^2+___+n)-(1+2+3+__+n)^2)

import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int n = sc.nextInt();
        int s = 0;
        int p = 0;
        for(int i = 1;i<=n;i++){
            System.out.println(s = s+(int)Math.pow(i,2)); 
            System.out.println(p = p+i); 
        }
        System.out.println(s-(int)Math.pow(p,2));
        
    }
    
}
