public class StrEveLoc {
    public static void main(String[] args) {
        String[] elements = {"apple", "banana", "orange", "grape", "pear", "kiwi"};
        System.out.println("Elements at even positions:");
        // loop to print elements present at even location of string
        for (int i = 0; i < elements.length; i += 2) {
            System.out.println(elements[i]);
        }
    }
}
