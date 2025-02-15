//insert random numbers in an array and find sum and avg
import java.util.*;
public class Task49 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = sc.nextInt();
        int []ar= new int[n];
        double s = 0;
        for(int i=0;i<ar.length;i++){
            ar[i]= rd.nextInt(6)+1;
            System.out.println(ar[i]);
            s= s+ar[i];
        }
        System.out.println(s);
        double avg = s/n;
        System.out.println(avg);
       


    }
}
