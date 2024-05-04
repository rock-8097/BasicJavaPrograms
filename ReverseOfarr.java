public class ReverseOfarr {
    public static void main(String[] args) {
        int [] arr ={10, 20, 30, 40, 50};
        int len_arr  = arr.length;
        int [] reverse_arr=new int[len_arr];
        int new_arr = len_arr;
        // loop for reverse array
        for (int i=0; i<len_arr;i++){
            reverse_arr[new_arr-1]=arr[i];
            new_arr-=1;
        }
        //loop for print reverse array
        for (int j= 0; j<len_arr; j++){
            System.out.println(reverse_arr[j]);
        }

    }
}
