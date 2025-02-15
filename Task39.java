//check whether a number is prime or not
public class Task39 {
    public static boolean prime(int n){
        int f=0;
        for(int i=2;i<=n/2;i++){
            
           if(n%i==0){
            f=1;
            break;
           }
        }
        if(f==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n1 =10;
        boolean res = prime(n1);
        System.out.println(res);
        
    }
    
}
