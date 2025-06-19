class FindTriplet {

    public static void Triplet(int num[]) {
        int len = num.length;
        int trip[] = new int[len];
        for(int i=0; i<len; i++) {
            for(int j=i+1; j<len; j++) {
                for(int k=j+1; k<len; k++) {
                    if((num[i] + num[j] + num[k]) == 0) {
                        trip[j-1] = num[i];
                        trip[j] = num[j];
                        trip[k] = num[k];
                        System.out.println("Values: "+trip[j-1]+" "+trip[j]+" "+trip[k]+" Current ijk value: "+(j-1)+" "+j+" "+k);
                        break;
                    }
                    System.out.println("After loop break "+i+j+k);
                }
                // i += 2;
            }
        }
        for(int i=0; i<trip.length; i++){
            System.out.print(trip[i] + " ");
        }
    }

    public static void main(String [] args) {
        int num[] = {-1, 0, 1, 2, -1, -4};
        Triplet(num);
    }
}