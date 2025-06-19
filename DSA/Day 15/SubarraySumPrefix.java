class SubarraySumPrefix {
    // calculate sum
    public static void sumPrefix(int array[]){
        int sum = 0, start = 0 , end = 0;
        int prefix[] = new int[array.length];
        int maxSum = Integer.MIN_VALUE;
        // int minSum = Integer.MAX_VALUE;
        prefix[0] = array[0];
        // precalculate the sum
        for(int i=1; i<array.length; i++){
            prefix[i] = prefix[i-1] + array[i];

        }

        for(int i=0; i<array.length; i++){
            start = i;
            for(int j=i; j<array.length; j++){
                end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max sum of subarray using prefix : " + maxSum);
    }
    // kadanes approach
    public static void kadanes(int array[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<array.length; i++){
            cs = cs + array[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max sum of subarray using Kadanes: " + ms);
    }

    public static void main(String [] args){
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        sumPrefix(number);
        kadanes(number);
    }
}