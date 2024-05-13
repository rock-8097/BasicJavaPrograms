public class PanNew {
    public static void main(String[] args) {
        String string = "Abcdefghijklmnopqrstuvwxyz12";
        string = string.toLowerCase(); // convert all characters to lowercase for simplicity
        String[] str = string.split("");
        boolean allLetterPresent = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean letterPresent = false;
            for (int i = 0; i < string.length(); i++) {
                if (ch == str[i].charAt(0)) {
                    letterPresent = true;
                    break;
                }
            }
            if (!letterPresent) {
                allLetterPresent = false;
                break; // exit the loop early if any letter is missing
            }
        }
        if (allLetterPresent) {
            System.out.println("Pangram String");
        } else {
            System.out.println("Not a Pangram String");
        }
    }
}
