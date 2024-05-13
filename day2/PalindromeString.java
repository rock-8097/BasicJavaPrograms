public class PalindromeString {
    public static void main(String[] args) {
        String name = "aaa";
        int len_name = name.length();
        String rev = "";//empty string for store reverse string in loop
        for (int i=len_name-1; i>=0; i--){
            rev = rev +name.charAt(i);
        }
        // condition to chexk palindrome string
        if (name.equals(rev)){
            System.out.println("Palindrome string");
        }
        else{
            System.out.println("Not a Palindrome string");
        }
    }
}