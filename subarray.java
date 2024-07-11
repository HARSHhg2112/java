public class subarray {
    public static void printsub(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i+1;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");//subarray
                }
                System.out.println();

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     int numbers[]={2,4,6,8,10};
     printsub(numbers);
    }
}
