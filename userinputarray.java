import java.util.Scanner;
public class userinputarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //reverse
        // for(int i=0;i<arr.length/2;i++){
        //     int t=arr[i];
        //     arr[i]=arr[size-1-i];
        //     arr[size-1-i]=t;
        // }
        //Bubble sort
        for(int i=0;i<arr.length;i++)
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }
        //print
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
