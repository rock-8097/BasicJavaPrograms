public class Primefactore {
    public static void main(String[] args){
        int num = 10;
        for (int i=1; i<num; i++){
            if (num%i ==0){
                boolean a=true;
                for (int j=2; j<i; j++){
                    if (i%j==0){
                        a=false;
                        break;
                    }
                }
                if (a){
                    System.out.println(i);
                }
            }
        }
    }
}
