public class slidingwindow {
    public int MaxsubArray(int[]arr,int k){
        int maxSum=0;
        int WindowSum=0;
        int start=0;
        for(int end=0;end<arr.length;end++){
            WindowSum=WindowSum+arr[end];
            if(end>=k-1){
                maxSum=Math.max(maxSum,WindowSum);
                WindowSum=WindowSum-arr[start];
                start++;
            }

        }
        return maxSum;
    }
    public static void main(String [] args){
        int arr[]={2,3,5,6,7,8};
        int k=3;
        int result=MaxsubArray(arr,k);
        System.out.println(result);

    }

    }
    

