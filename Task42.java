//count how many times a element present in an array
public class Task42 {
    public static int count(int []ar,int k){
        int c=0;
        for(int i=0;i<ar.length;i++){
          if(  ar[i]==k){
            c++;
          }
        }
return c;
    }
    public static void main(String[] args) {
        int  []ar={9,2,7,14,2,5};
        int res = count(ar,14);
        System.out.println(res);
    }
    
}
