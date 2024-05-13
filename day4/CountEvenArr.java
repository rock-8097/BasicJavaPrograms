public class CountEvenArr {
    public static void main(String[] args) {
        int for_even_arr[]={54,32,42,44,31,313,544};
        int count_eve = 0;
        for (int i = 0; i<for_even_arr.length;i++){
            if (for_even_arr[i]%2==0){
                count_eve = count_eve+1;
                
            }
        }
        System.out.println(count_eve);
    }
}
