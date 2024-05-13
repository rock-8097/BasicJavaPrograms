public class SecondLargNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,5};
        int larg=arr[0],sec_larg=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>larg){
                sec_larg=larg;
                larg=arr[i];
            }
            else if(arr[i]<larg && arr[i]>sec_larg){
                sec_larg = arr[i];
            }
        }
        System.out.println(sec_larg);
    }
}
