public class CoinFlipHorT {
    public static void randomFlip(int heads,int tails,int flip){
        for (int i =0; i<flip;i++){
            double poss = Math.random();
            System.out.println(poss);
            if (poss<0.5){
                tails++;
            }
            else{
                heads++;
            }
        }
        double percent_heads = (double) heads / flip * 100;
        double percent_tails = (double) tails / flip * 100;
        System.out.println("Number of flips: " + flip);
        System.out.println("Percentage of Heads: " + percent_heads + "%");
        System.out.println("Percentage of Tails: " + percent_tails + "%");
    }
    public static void main(String[] args){
        int flip = 10;
        int heads = 0;
        int tails = 0;
        randomFlip(heads, tails, flip);
    }
}
