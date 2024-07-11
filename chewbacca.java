import java.util.*;
public class chewbacca {
    public static void main(String args[]){
        int arr[] = new int[100];
        int i = arr.length;
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int d = n%10;
        int x = 9-d;
        if(x<d){
            arr[i] = x;
            i++;
        }
        arr[i] = d;
        System.out.print(arr[i]);
    }
}
