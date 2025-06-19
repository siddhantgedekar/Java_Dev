class SpiralMatrix {
    public static void printSprial(int arr[][]) {
        // iterate through the array
        // take starting and ending values of index in the matrix
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        // run until starting and ending meet at one point
        while( startRow <= endRow && startCol <= endCol ) {
            // top
            for(int top = startRow; top <= endRow; top++) {
                System.out.print(" " + arr[startRow][top]);
            }
            // right
            for(int right = startRow+1; right <= endRow; right++){
                System.out.print(" " + arr[right][endCol]);
            }
            // bottom
            for(int bottom = endCol-1; bottom >= startCol; bottom--) {
                if(startCol == endCol){
                    break;
                }
                System.out.print(" " + arr[endRow][bottom]);
            }
            // left
            for(int left = endRow-1; left >= startRow+1; left--) {
                if(startRow == endRow){
                    break;
                }
                System.out.print(" " + arr[left][startCol]);
            }

            // increase and decrease the values of col and row
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    // public static void printArray(int array[]){
    //     for(int i=0;i<array.length;i++){
    //         for(int j=0;j<array[0].length;j++){
    //             System.out.print(" ")
    //         }
    //     }
    // }

    public static void main(String [] args) {
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        printSprial(matrix);
    }
}