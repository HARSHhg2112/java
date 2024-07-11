public class selectionsort {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        int n =arr.length;
        //sorting logic
        for(int i=0;i<n-2;i++){
            int temp =0; 
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]);
                min=j;
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    
    }
    
}
