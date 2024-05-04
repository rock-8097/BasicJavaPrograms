
public class armstrong {
    public static void main(String[] args) {
        int number = 545;
        int num_c=number;
        double ans=0;
        int digit=0;
        String for_num = String.valueOf(number);
        int order = for_num.length();
        // loop to get each individuals sum with power raised the length of number
        while(number>0){
            digit = number % 10;
            ans = ans + Math.pow(digit,order);
            number = number/10;
        }
        // condition to check armstrong number or not
        if (num_c==ans){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}
