class SubarraySum {
    // find subarray sum
    public static void arraySum(int array[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int start = 0, end = 0;
        // loop
        for(int i=0; i<array.length; i++){
            start = i;
            for(int j=i; j<array.length; j++){
                end = j;
                for(int k = start; k <= end; k++){
                    sum += array[k];
                }
                System.out.println("Subarray sum when i = " + i + " is " + sum);
                if(sum > maxSum) {
                    maxSum = sum;
                }
                if(sum < minSum) {
                    minSum = sum;
                }
                sum = 0;
            }
        }
        System.out.println("Max Sum: " + maxSum + "\nMin Sum: " + minSum);
    }
    // call method in main method
    public static void main(String [] args){
        int number[] = {1, -2, 6, -1, 3};
        arraySum(number);
    }
}