/*Write a program to check if the temperature is below freezing (less than 0°C). 
If it is, print "Warning: Temperature below freezing!". */
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temprature");
        int t = sc.nextInt();
        if(t<0){
            System.out.println("Warning: Temperature below freezing!");
        }
        
    }
}
