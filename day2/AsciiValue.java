public class AsciiValue {
    public static void main(String[] args) {
        char ch = 'A';
        int val_ch = ch;
        /* for loop to get range of 'A' to 'Z' and  'a' to 'z'*/
        // for (int i=0;i<58;i++){
        //     int val_ascii = val_ch + i;
        //     char char_ascii = (char) val_ascii;
        //     // ascii value 91 to 96 contains symbols
        //     if ((val_ascii>64 && val_ascii<91) || (val_ascii>96 && val_ascii<123)){
        //         System.out.println("Ascii Value of "+char_ascii+" is: "+val_ascii);
        //     }
        // }
        int val_ch1 = val_ch +1;
        char ch1 = (char) val_ch1;
        System.out.println(val_ch1 +" is "+ ch1);
        
    }
}