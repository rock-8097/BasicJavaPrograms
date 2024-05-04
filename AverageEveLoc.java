public class AverageEveLoc {
    public static void main(String[] args) {
        int arr_avg_loc_even[]= {54,32,42,44,31,313,544};
        double loc_sum=0;
        double count_eve = 0;
        double average_eve;
        for (int i =0;i<=arr_avg_loc_even.length;i++){
            //to get even position in array
            if (i%2==0){
                loc_sum=loc_sum + arr_avg_loc_even[i];
                count_eve=count_eve+1;
                System.out.println(loc_sum+","+count_eve);
            }
        }
        // Average of even position element present in array
        average_eve = (loc_sum / count_eve);
        System.out.println("Average of Number present at even location: "+average_eve);
    }
}
