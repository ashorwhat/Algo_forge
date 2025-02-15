//Reverse
public class Task59 {
    public static int rev(int n){
        int r =0;
        while(n>0){
            r = (r*10)+(n%10);
            n=n/10;
        }
        return r;

    }
    public static void main(String[] args) {
        int n =12345;
        int res = rev(n);
        System.out.println(res);
    }
    
}
