public class SecondLastString {
    public static void main(String[] args) {
        String string = "Hai,Hello,How,are,you";
        String[] bits = string.split(",");
        String second_lastWord = bits[bits.length-2];
        System.err.println(second_lastWord);
    }
}
