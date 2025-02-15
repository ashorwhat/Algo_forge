
import java.util.Scanner;

//insert element 1 to 99 and print how many times u print a particular value loops ends with element 0
public class Task63 {
    public static void main(String[] args) {
        int []ar= new int[100];
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x =sc.nextInt();
            if(x==0){
                break;
            }
            ++ar[x];  
        }
        for(int i=1;i<100;i++){
            if(ar[i]!=0){
                System.out.println(i+" : "+ar[i]+"times");
            }
        }
        
        
    }
    
}
