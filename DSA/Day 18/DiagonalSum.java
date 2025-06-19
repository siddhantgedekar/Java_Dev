class DiagonalSum {
    public static void dSum(int arr[][]) {
        // int a=0, b=0, c=arr.length-1, sum = 0;
        // while(a != arr.length) {
        //     sum += arr[a][b] + arr[c][a];a++;b++;c--;
        // }
        // if(arr.length%2 == 1 || arr[0].length%2 == 1){
        //     sum -= arr[arr.length/2][arr[0].length/2];
        //     System.out.println(sum);
        // }
        // else{
        //     System.out.println(sum);
        // }

        // OR optimize if again
        int sum = 0;
        int len = arr.length;
        for(int i=0;i<len;i++){
            sum += arr[i][i] + arr[i][len-1-i];
        }
        if(arr.length%2 == 1){
            sum -= arr[len/2][len/2];
        }
        System.out.println(sum);
    }

    public static void main(String [] args){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        int matrix2[][] = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        dSum(matrix);
        dSum(matrix2);
    }
}