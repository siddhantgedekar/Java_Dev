class Twice {
    public static boolean twice(int array[]){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String [] args){
        int nums[] = {1,2,3,1};
        System.out.println(twice(nums));
        int nums1[] = {1,2,3,4};
        System.out.println(twice(nums1));
        int nums2[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(twice(nums2));
    }
}