public class Panagram {
    public static void main(String[] args) {
        String string = "Abcdefghijklmnopqrstuvwxyz12";
        string = string.toLowerCase();//convert all char into small case for simplicity
        boolean allLetterPresent = true;  
        //loop iterate over each character of the given string  
        for (char ch = 'a'; ch <= 'z'; ch++){  
            //condition if the string does not contains all the letters then break
            if (!string.contains(String.valueOf(ch)))   
            {  
            allLetterPresent = false;  
            break;  
            }  
        }  
        //checks if all the letters are presented or not  
        if (allLetterPresent){  
            System.out.println("Pangram String"); 
        } 
        else{ 
            System.out.println("Not a Pangram String");  
        }
    }  
    
}
