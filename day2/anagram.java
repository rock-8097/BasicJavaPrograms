import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String str1 = "gote";
        String str2 = "egot";
        // convert string into array
        char[] char_array1 = str1.toCharArray();
        char[] char_array2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(char_array1);
        Arrays.sort(char_array2);
        if (str1.length()==str2.length()){
            boolean a=false;
            // loop for get boolean value to check anagram
            for (int i=0; i<str1.length(); i++){
                if (char_array1[i]!=char_array2[i]){
                    System.out.println("not anagram string");
                    break;
                }
                else{
                    a=true;
                }
            }
            if (a){
                System.err.println("anagram string");
            }
        }
    }
}
