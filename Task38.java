//check whether a number is palindrome or not means reverse of a number is like actual number 

import java.util.Scanner;
public class Task38 {
    public static boolean palindrome(int n){
        int a=n;
        int r =0;
        while(n>0){
            r = (r*10)+(n%10);
            n = n/10;
        }if(a==r){
        return true;}
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean res = palindrome(n);
        System.out.println(res);
        
    }
    
}
