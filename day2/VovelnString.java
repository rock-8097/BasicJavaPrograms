public class VovelnString {
    public static void main(String[] args) {
        String vov_str = "sajdhkh";
        // loop to check vovel in string
        for (int i = 0; i < vov_str.length(); i++) {
            char ch = vov_str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.print(ch + " ");
            }
        }
    }
}
