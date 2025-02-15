public class Task41 {
    public static int max(int []ar){
        int max =ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]>ar[0]){
                max = ar[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []ag = {1,2,3,4,5,6,7};
        int res = max(ag) ;
        System.out.println(res);
        
    }
    
}
