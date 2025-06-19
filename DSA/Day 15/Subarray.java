class Subarray{
    public static void subArr(int array[]){
        int len = array.length;
        int ts = 0;
        for(int i=0; i<len; i++){
            int start = i; // current position
            for(int j=i+1; j<len; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(array[k] + " ");
                }
                System.out.println();
                ts++;
            }
        }
        System.out.println("\n>> Total subarrays are " + ts);
    }
    public static void main(String [] args){
        int number[] = {2,4,6,8,10};
        subArr(number);
    }
}