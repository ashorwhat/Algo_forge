//how many numbrs divisble by 3 or 5
public class Task43 {
    public static int count(int []ar){
        int c =0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]%3==0 || ar[i]%5==0){
                c++;
            }
        }
        return c ;
    }
    public static void main(String[] args) {
        int []ar={9,2,7,1,15,2,5};
        int res = count(ar);
        System.out.println(res);

    }
    
}
