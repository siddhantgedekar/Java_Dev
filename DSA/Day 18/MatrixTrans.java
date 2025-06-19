public class MatrixTrans {
    public static void transpose (int arr[][]) {
        int trans[][] = new int[arr[0].length][arr.length];
        for(int i=0; i<arr[0].length;i++) {
            for(int j=0; j<arr.length;j++) {
                trans[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose is: ");
        for(int i=0; i<trans.length;i++) {
            for(int j=0; j<trans[0].length;j++) {
                System.out.print(trans[i][j]+" ");
            }
        }
    }
    public static void main(String [] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(matrix);
    }
}