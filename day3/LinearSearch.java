public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {10,20,30,50,70,90};    
        int key = 10;
        boolean a=false;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==key){
                System.out.println(key+" is found at index "+i);
                a=true;
            }
        }
        if(a==false){
            System.out.println(key+" not found in array");
        }
    }
}
