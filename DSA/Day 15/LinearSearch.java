class LinearSearch {
    public static void main(String [] args){
        int arr[] = {2,5,7,3,1};
        int key = 7;
        int res = search(arr, key);

        if(res == -1){
            System.out.println("Invalid key");
        }
        else{
            System.out.println("Key is at: "+res);
        }
    }

    public static int search(int array[], int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
}