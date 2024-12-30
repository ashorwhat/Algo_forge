import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println("enter the limit of a table");
		int l = sc.nextInt();
		int p=1;
		for(int i=1;i<=l;i++) {
			p=i*n;
			System.out.println(p);
		}
	

    }
    
}
