import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            System.out.println("Enter ");
            int fib_num = num.nextInt();
            int num1=0, num2=1;
            for (int i=0; i<=fib_num; i++){
                System.out.println(num1);
                int temp=num1 + num2;
                num1=num2;
                num2=temp;
            }
        }
    }
}
