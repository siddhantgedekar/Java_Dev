public class NQueens {
    public static void printArray (char arr[][]) {
        System.out.println("----------- Chess Borad -----------");
        for(int i=0; i<arr.length;i++) {
            for(int j=0; j<arr.length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe (char board[][], int row, int col) {
        // check vertical up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // check left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // check right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void Queens (char board[][], int row) {
        // base case
        if(row == board.length){
            printArray(board);
            return;
        }
        // perform action
        for(int i=0; i<board.length;i++) {
            if(isSafe(board, row, i)){ // place queen when it's safe.
                board[row][i] = 'Q'; // assign queens
                Queens(board, row+1); // next row
                board[row][i] = 'X'; // backtracking
            }
        }
    }
    
    public static void main(String [] args) {
        int n = 5;
        char board[][] = new char[n][n];

        // fill the board
        for(int i=0; i<board.length;i++) {
            for(int j=0; j<board.length;j++) {
                board[i][j] = 'X';
            }
        }

        // call the function
        Queens(board, 0);
    }
}