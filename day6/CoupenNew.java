import java.util.Random;
import java.util.Scanner;

public class CoupenNew {
    public static int coupen(int n){
        Random random = new Random();
        int rand_num= 0, count=0;
        while (rand_num != n){
            rand_num=random.nextInt(n+1);
            if (rand_num!=n){
                count++;
            }
            else{
                break;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter coupen number: ");
        int n = num.nextInt();
        num.close();        
        System.out.println("Total random number needed to have all distinct numbers : "+ coupen(n));
    }
}