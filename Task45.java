public class Task45 {
    public static boolean palindrome(String str){
        int f =0;
        int i = 0;
        int j =str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                f=1;
            }
                i++;
                j--;
        }
        if(f==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "madam";
        boolean res = palindrome(str);
        System.out.println(res);

        
    }
    
}
