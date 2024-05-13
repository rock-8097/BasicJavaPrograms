import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Enter Year to check leap Year: ");
        int year = val.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+" is Leap year");
        }else{
            System.out.println(year+" is not Leap year");
        }
        val.close();
    }
}