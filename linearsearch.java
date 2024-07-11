public class linearsearch {
    public static void main(String[] args) {
        int arr[]={10,12,13,14,15};
        int size =arr.length;
        int key=15;
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.println(key+ "is found at index"+i);
                break;
            }
        }
    }
}
