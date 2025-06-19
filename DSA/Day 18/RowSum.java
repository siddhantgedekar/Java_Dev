public class RowSum {
    public static void rSum (int arr[][]) {
        int sum = 0;
        for(int i=0; i<arr[0].length;i++) {
            sum += arr[1][i];
        }
        System.out.print("Sum of elements of second row is: "+sum);
    }
    public static void main(String [] args) {
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        rSum(nums);
    }
}