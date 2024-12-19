import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            
            System.out.print(i+" " );
            if (i%5==0){
                System.out.println();
            }

        }
}
}
