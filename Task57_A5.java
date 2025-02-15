import java.util.Scanner;
//sumiision of all factors (b)ammicable check (c)Execution pattern
public class Task57_A5 {
public static int sumfactor(int n){
    int s=1;
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            s=s+i;
        }
    }
    return s;

}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int res = sumfactor(n);
        System.out.println(res);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int s1 = sumfactor(n1);
        int s2 = sumfactor(n2);
        if(s1==n2 && s2==n1){
            System.out.println("yes");
        }
        else{
            System.out.println("Not");
        }
    }
    
}
