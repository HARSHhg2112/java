public class mergesort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
       
    }
    public static void mergeSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    //merge method to merge the sorted part
    public static void merge(int arr[],int si,int mid,int ei){
        int temp []= new int [ei-si+1];//defining the size of the temperory array
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<-ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;

        }
        //for left elements of first sorted part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for left eelments ofright part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp to original array
        for( k=0, i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={65,78,89,12};
        mergeSort(arr,0,arr.length-1);
        printarr(arr);
        
    }
    
}
