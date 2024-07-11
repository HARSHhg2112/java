public class nQueen {
public static void Queensit(char board[][],int row){
    //base case 
    if(row==board.length){
        printboard(board);
        return;
    }
    //queen placcing in each row
    for(int col=0;col<board.length;col++){
        board[row][col]='Q';
        Queensit(board,row+1);//queen sitting foe next row
        board[row][col]='.';//backtrack kr ke 
    }

}
public static void printboard(char board[][]){
    
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.println(board[i][j]);
        }
        System.out .println();
    }
}

    public static void main(String[] args) {
      int n=2;
      char board[][]=new char[n][n];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
         board[i][j] ='.';// ye ham ephele socha rkha tha ki abhi tak koi phelese nhi baitha h pura chees board khali h
        }
      }  
      Queensit(board,0);
    }
}
