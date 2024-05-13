public class ArrOddPos {
    public static void main(String[] args) {
        int for_odd_arr[]={54,32,42,44,31,313,544};
        for (int i = 0; i<for_odd_arr.length;i++){
            if (i%2!=0){
                System.out.println(for_odd_arr[i]);
            }
        }
    }
}
