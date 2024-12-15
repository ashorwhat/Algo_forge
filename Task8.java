/* WAP to print the grade of student for folllowing conditionusing Switch Case
 * 100-90 'O'
 * 80-89  'A'
 * 70-79  'B'
 * 60-69  'C'
 * 50-59  'D'   
 * <50 'NFD' */

import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur marks");
        int m = sc.nextInt();
        switch (m/10) {
            case 10:
            case 9:
                System.out.println("O");
                break;
                case 8:
                System.out.println("A");
                break;
                case 7:
                System.out.println("B");
                break;
                case 6:
                System.out.println("C");
                break;
                case 5:
                System.out.println("B");
                break;
                default:
                System.out.println("NFD");       
                
        }
            
        

        
    }
    
}
