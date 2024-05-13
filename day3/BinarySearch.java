public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {10,20,30,50,70,90};    
        int key = 40;
        boolean a=false;
        int left=0;
        int right= arr.length -1;
        while (left<=right){
            int mid = (left+right)/2;

            if (arr[mid] == key){
                System.out.println(key+" is found at index "+mid);
                a=true;
            }
            if (arr[mid]<key){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if (a==false){
            System.out.println(key+" not found in array");
        }
    //     left = 0
    // right = len(arr) - 1

    // while left <= right:
    //     mid = (left + right) // 2

    //     if arr[mid] == targetVal:
    //         return mid
        
    //     if arr[mid] < targetVal:
    //         left = mid + 1
    //     else:
    //         right = mid - 1
    }
}
