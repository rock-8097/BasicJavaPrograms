public class ReverseNum {
    public static void main(String[] args){
        int number = 12345;
        int ans=0;
        int digit=0;
        String for_num = String.valueOf(number);
        // loop to reverse number
        for (int i = 0; i< for_num.length(); i++){
            digit = number % 10;
            ans = ans*10 + digit;
            number = number/10;
        }
        System.out.println("Reverse number is: "+ans);
    }
    
}
