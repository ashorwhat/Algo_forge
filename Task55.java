//chech string is palindrome
public class Task55 {
    public static boolean palindrome(String str){
        int i = 0;
        int j = str.length()-1;
        int t=0;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                t=1;
            }
            i++;
                j--;
        }
        if(t==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "madah";
        boolean res = palindrome(str);
        System.out.println(res);
    }
    
}
