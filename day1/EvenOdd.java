public class EvenOdd {
    public static void main(String[] args) {
        int [] arr = {54,32,42,44,31,313,544};
        int [] even = new int[7];
        int [] odd = new int[7];
        int j=0;
        int k=0;
        for (int i=0;i<arr.length;i++){
            // condition to check array element is even or odd
            if (arr[i]%2==0){
                even[j]=arr[i];
                j++;
                System.out.println(arr[i]+"is Even");
            }
            else{
                odd[k]=arr[i];
                k++;
                System.out.println(arr[i]+"is odd");
            }
        }

    }

}
