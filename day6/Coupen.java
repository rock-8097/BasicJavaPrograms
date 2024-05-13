import java.util.*;

class Coupen {
    static int generateCoupon(int n) {
        Random random = new Random();
        return random.nextInt(n) + 1;
    }

    static int generateDistinctCoupons(int n) {
        Set<Integer> distinctCoupons = new HashSet<>();
        int totalRandomNumbers = 0;

        while (distinctCoupons.size() < n) {
            int randomCoupon = generateCoupon(n);
            System.out.println(randomCoupon);
            totalRandomNumbers++;
            distinctCoupons.add(randomCoupon);
        }

        return totalRandomNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of distinct coupon numbers: ");
        int num = scanner.nextInt();
        int totalRandomNumbers = generateDistinctCoupons(num);
        System.out.println("Total random numbers needed to generate all distinct coupons: " + totalRandomNumbers);
        scanner.close();
    }
}