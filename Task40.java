//check for pentagonal number
public class Task40 {
    public static int pentagonalNumber(int n){
        return(n*(3*n-1)/2);
    }

    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(pentagonalNumber(i));
        }
        
    }
    
}
