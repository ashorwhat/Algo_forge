//no of vowels in a String
public class Task44 {
    public static int count(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at position i
            if (ch == 'A' || ch == 'a' || 
                ch == 'E' || ch == 'e' || 
                ch == 'I' || ch == 'i' || 
                ch == 'O' || ch == 'o' || 
                ch == 'U' || ch == 'u') {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String str = "madam"; // Input string
        int res = count(str); // Call count method
        System.out.println(res); // Print the result
    }
}