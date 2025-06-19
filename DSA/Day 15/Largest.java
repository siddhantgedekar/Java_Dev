class Largest{
    public static int largest(int array[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++){
            if(largest < array[i]){
                largest = array[i];
            }
        }
        return largest;
    }

    public static void main(String [] args){
        int numbers[] = {2,6,3,8,7,12,15,38};
        System.out.println("Lasgest number is: "+largest(numbers));
    }
}