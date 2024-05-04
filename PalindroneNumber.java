public class PalindroneNumber {

    public static void main(String[] args) {
        int number = 12321;
        int pal = number;
        int ans=0;
        int digit=0;
        String for_num = String.valueOf(number);
        // loop for reverse number
        for (int i = 0; i< for_num.length(); i++){
            digit = number % 10;
            ans = ans*10 + digit;
            number = number/10;
        }
        //condition to check palindrne or not
        if (pal==ans){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}
