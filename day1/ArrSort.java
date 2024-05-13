public class ArrSort {
    public static void main(String[] args) {
        int arr_sort[]= {54,32,42,44,31,313,544};
        // 1st loop to start with initial value
        for (int i=0; i<arr_sort.length;i++){
            // 2nd loop to check large value and sort values to ascending order
            for (int j=i+1; j<arr_sort.length;j++){
                int temp=0;
                if (arr_sort[i]>arr_sort[j]){
                    temp = arr_sort[i];
                    arr_sort[i]=arr_sort[j];
                    arr_sort[j]=temp;
                }
            }
            System.out.println(arr_sort[i]);
        }
    }
}
