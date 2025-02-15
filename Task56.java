//check for consecutive number
public class Task56 {
    public static boolean arrange(int n1,int n2, int n3){
        if(n2-n1==1 && n3-n2==1){
            return true;
        }
        else{
           return false;
        }

    }
    public static void main(String[] args) {
        int n1 =3;
        int n2= 5;
        int n3 =4;
        boolean res = arrange(n1,n2,n3);
        System.out.println(res);
    }
    
}
