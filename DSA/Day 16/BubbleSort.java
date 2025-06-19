class BubbleSort {
    static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int array[]) {
        for(int i=0; i<array.length; i++) {
            int start = array[i];
            for(int j=i+1; j<array.length; j++) {
                int next = array[j];
                if(start > next) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        printArr(array);
    }

    static void selectionSort(int array[]){
        for(int i=0; i<array.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<array.length; j++){
                if(array[minPos] > array[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
            // System.out.println("First: "+array[i] + ", Next: " + array[i + 1]);
        }
        printArr(array);
    }

    static void insertionSort(int array[]) {
        for(int i=1; i<array.length; i++) {
            int curr = array[i];
            int prev = i-1;
            // iterating throught sorted part. i.e left side.
            // compare if prev val > curr val
            // if true, swap the values
            while(prev >= 0 && array[prev] > curr) {
                array[prev+1] = array[prev];
                prev--;
            }
            array[prev+1] = curr;
        }
        printArr(array);
    }


    public static void main(String [] args){
        int num[] = {10,8,1,5,2,3,9,6,7,4};
        System.out.println("Insertion sort");
        insertionSort(num);
        System.out.println("\nSelection sort");
        selectionSort(num);
        System.out.println("\nBubble sort");
        sort(num);
    }
}