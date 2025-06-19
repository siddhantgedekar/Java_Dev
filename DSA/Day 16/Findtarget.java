class Findtarget {
    // find target
    static int Solution(int num[], int target){
        for(int i=0; i<num.length; i++) {
            if(num[i] == target){
                return i;
            }
        }
        return -1;

    }

    public static void main(String [] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println("Target is present at index: " + Solution(nums, 0));
    }
}