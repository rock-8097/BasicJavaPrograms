import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner char_vc = new Scanner(System.in);
        System.out.print("Enter one charecter to check Vowel or Consonent: ");
        String ch = char_vc.nextLine();
        char_vc.close();
        if (ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u"){
            
            System.out.println(ch+" is Vowel");
        }
        else{
            System.out.println(ch+" is Consonent");
        }
    }
}