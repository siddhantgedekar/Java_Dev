public class Frequency {
    public static void Freq (int arr[][]) {
        int count = 0;
        for(int i=0; i<=arr.length-1;i++) {
            for(int j=0; j<arr[0].length;j++) {
                if(arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String [] args) {
        int mat[][] = {{4,7,8},
                       {8,8,7}};
        Freq(mat);
    }
}