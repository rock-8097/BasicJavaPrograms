import java.util.*;
public class HarmonicNumber {
    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            System.out.println("Enter ");
            int harm_num = num.nextInt();
            double sum=0;
            for (double i=1; i<=harm_num; i++){
                sum=sum+(1/i); 
            }
            System.out.println("harmonic number is: "+sum);
        }
    }
}
