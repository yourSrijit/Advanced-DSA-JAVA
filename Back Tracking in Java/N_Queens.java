package BackTracking;

public class N_Queens {
    public static boolean isSafe(char[][]board,int row,int column) {
        //1 check for up ans down
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column] == 'Q') {
                return false;
            }
        }
//        2. Check for corner left
        for(int i=row-1, j=column-1;i>=0 && j>=0;i--,j--){
            if (board[i][j] == 'Q') {
                return false;
            }
        }
//        3. Check for corner right
        for(int i=row-1,j=column+1;i>=0 &&j<board.length;i--,j++){
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void solveNqueen(char[][]board,int n){
        if(n==board.length){
            printBoard(board);
            return;
        }

        for (int i=0;i<board.length;i++){
            if(isSafe(board,n,i)) {
                board[n][i] = 'Q';
                solveNqueen(board, n + 1);
                board[n][i] = 'x';
            }
        }
    }
    public static void printBoard(char [][]board){
        int l=board.length;
        System.out.println("-----chess board-----");
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=4;
        char [][]board=new char[row][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                board[i][j]='x';
            }
        }
        solveNqueen(board,0);
    }
}
