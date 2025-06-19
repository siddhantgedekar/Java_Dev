class ReverseArray{
    public static void reverse(int array[]){
        // declare variable
        int first = 0, last = array.length-1;

        while(first < last){
            // swap values
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;

            // modify values of first and last
            first++;
            last--;
        }
    }
    public static void main(String[] args){
        // reverse an array
        int number[] = {1,2,3,4,5,6,7,8,9};
        reverse(number);
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}