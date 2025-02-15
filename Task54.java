//total no of vowels in an string
public class Task54 {
    public static int count(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'A'|| ch == 'a'|| ch == 'E'|| ch == 'e'|| ch == 'I'|| ch == 'i'||ch == 'O'|| ch == 'o'|| ch == 'U'|| ch == 'u'){
            count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="madam";
        int res = count(str);
        System.out.println(res);

    }
    
}
