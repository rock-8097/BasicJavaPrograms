import java.util.Scanner;

public class SumOfThreeIntToZero {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Integers number: ");
        int num1 = num.nextInt();
        System.out.print("array numbers: ");
        int[] arr = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr[i] = num.nextInt();
        }
        num.close();
        int count = 0;
        int c = arr.length;
        for (int i =0 ; i< c-2 ; i++){
            for (int j=i+1; j<c-1 ; j++){
                for(int k =j+1; k<c ; k++){
                    if (arr[i]+arr[j]+arr[k]==0){
                        count += 1;
                    }
                }
            }
        }
        System.out.println("Number of count of sum zero: "+count);
    }
}
