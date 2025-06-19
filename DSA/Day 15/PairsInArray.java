class PairsInArray{
    // print pairs
    public static void pairs(int array[]){
        int len = array.length;
        for(int i=0; i<len; i++){
            int curr = array[i]; // current value
            for(int j=i+1; j<len; j++){
                System.out.print("(" + curr + "," + array[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        int number[] = {2,4,6,8,10,12,14};
        System.out.println("Pairs in the array as follows-> ");
        pairs(number);
    }
}