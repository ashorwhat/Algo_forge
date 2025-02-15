//table (b)b/w 1 to 25 
public class Task61 {
    public static void table(int n){
        int p=0;
        for(int i=1;i<=10;i++){
            p=n*i;
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        int n = 8;
        table(n);
        for(int i=2;i<25;i++){
            table(i);
        }
    }
    
}
