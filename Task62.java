//sumission of all numbers between 1 t0 n
public class Task62 {
    public static int sum(int n){
        int s =0;
        for(int i=2;i<n;i++){
            s =s+i;
        }
        return s;
    }
    public static void main(String[] args) {
        int n = 10;
        int res = sum(n);
        System.out.println(res);
        
    }
    
}
