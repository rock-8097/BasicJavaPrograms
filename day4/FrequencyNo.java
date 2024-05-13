public class FrequencyNo {
    public static void main(String[] args) {
        int[] name = {1,2,4,3,1,4,3,1};
        for (int i=0; i<name.length; i++){
            int count = 1;
            for (int j=i+1; j<name.length; j++){
                if(name[i]==name[j]){
                    count +=1;
                    name[j]=0;
                }
            }
            if (name[i]!= 0){
                System.out.println(name[i]+" Frequency is "+count);
            }
        }
    }
}