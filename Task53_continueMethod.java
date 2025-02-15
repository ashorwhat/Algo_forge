//Write a java program to count the total number of occurrence of
//a character in a given string by using the following function header.
public class Task53_continueMethod {
    public static int count(String str,char ch){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "madam";
        char ch = 'a';
        int res = count(str,ch);
        System.out.println(res);
    }
    
}
