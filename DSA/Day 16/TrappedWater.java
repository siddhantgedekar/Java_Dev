class TrappedWater {

    // function to find trapped water
    public static int tWater(int array[]){
        // calculate left max boundary
        int n = array.length;

        int leftMax[] = new int[n];
        leftMax[0] = array[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(array[i], leftMax[i-1]);
        }

        // calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = array[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(array[i], rightMax[i+1]);
        }

        int water = 0;
        // loop
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(rightMax[i], leftMax[i]);

            water += waterlevel - array[i];
        }
        return water;
    }

    public static void main(String [] args){
        int bars[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped water is: " + tWater(bars));
    }
}