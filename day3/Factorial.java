import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            System.out.println("Enter ");
            int fact_num = num.nextInt();
            int sum=1;
            for (int i=1;i<=fact_num; i++){
                sum = sum * i;
                System.out.print("*"+i+" ");
            }
            System.out.println("\nfactorial of "+fact_num+" is "+sum);
        }
    }
}
