import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 2, 2, 7, 8, 8, 3};
        Set<Integer> hash_Set = new HashSet<Integer>();
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) {
                    hash_Set.add(arr[j]);
                }
                    
            }  
        }
        System.out.println(hash_Set);
    }  

}