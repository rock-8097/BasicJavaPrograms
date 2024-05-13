import java.util.Scanner;

public class PowerOf2 {
    public static double Power2(int number){
        double pow_2 = Math.pow(2,number);
        return pow_2;
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter power of 2 you want: ");
        int power = num.nextInt();
        num.close();
        if (Power2(power)<=(Integer.MAX_VALUE)){
            System.out.println("2 ^ "+power+" = "+(int)Power2(power));
        }
        else{
            System.out.println("Overflow");
        }
    }
}
