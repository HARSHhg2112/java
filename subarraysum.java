public class subarraysum {
    public static void sumtobemin(int numbers[]){
        int currsum=0;
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    currsum+=numbers[k];
                    System.out.println(currsum);
                    if(currsum<minsum && currsum>=0){
                        minsum=currsum;

                    }
                }

            }
        }
        
    }
    public static void main(String srgs[]){
        int numbers[]={1,3,5,7,4,6,2};
        sumtobemin(numbers);

    }
    
}
