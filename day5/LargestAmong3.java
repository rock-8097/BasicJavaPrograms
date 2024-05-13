import java.util.Scanner;

public class LargestAmong3 {
    public static void Large(int num1,int num2,int num3) {
        if (num1 > num2 && num1 > num3){
            System.out.println("largest Element is "+num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println("largest Element is "+num2);
        }
        else /*if(num3 > num1 && num3 > num2)*/{
            System.out.println("largest Element is "+num3);
        }
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Three Element to check Largest: ");
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int num3 = num.nextInt();
        num.close();
        Large(num1,num2,num3);
    }
}
