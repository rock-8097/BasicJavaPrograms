public class SwapTwoNumbers {
    public static void swapNum(int a,int b) {
        int temp = a+b;
        a=temp-a;
        b=temp-b;
        System.out.println(a+","+b);
    }
    public static void main(String[] args) {
        int a=2;
        int b=3;
        /* without using third variable */
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println(a+","+b);
        swapNum(a, b);
    }
}
