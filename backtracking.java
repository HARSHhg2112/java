public class backtracking {
   public static void changeArr(int arr[],int i,int val){
    //base case
    if(i==arr.length){
        printArr(arr);
        return;

    }
    arr[i]=val;
    changeArr(arr,i+1,val+1);
    arr[i]=arr[i]-2;
   } 
   public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
   }
{
   public static void nQueen(char board[][],int row){
    //base case
    if(row==board.length){
        printboard(board);
        return;
        //coloum loop
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            nQueen(board,row+1);
            board[row][j]='.';
        }
    }
    public static void printboard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.println(board[i][j]);
            }
        }
    }
   }
   public static void main(String args[]){
    int arr []=new int [5];  
    changeArr(arr,0,1);
    printArr(arr);
   }
}
