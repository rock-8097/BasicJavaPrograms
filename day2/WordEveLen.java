public class WordEveLen {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "grape", "pear", "kiwi"};
        //str = words.split(" ");
        System.out.println("Words with even length:");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
    