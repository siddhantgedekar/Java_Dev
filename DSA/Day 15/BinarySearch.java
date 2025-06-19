// search in an array but it should be sorted.
class BinarySearch{
    // binary search function
    public static int binSearch(int array[], int key){
        int start = 0;
        int end = array.length - 1;
        // iterate from 0 to n
        while(start <= end){
            // every time we divide it by 2, which goes like 2^n. Divide based on below if conditions.
            int mid = (start + end)/2;

            // comparission
            if(array[mid] == key){ // if mid value is key then return key
                return mid;
            }
            else if(key < array[mid]){ // if mid key < mid, means it lies on left side.
                start = mid-1;
            }
            else{ // it lies on right side.
                end = mid+1;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        // array
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        // calling function
        System.out.println("Found key at index: " + binSearch(numbers, 5));
    }
}