public class CountSetBit {
    public static int countBit (int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String [] args) {
        // count set bits
        System.out.println(countBit(15));
    }
}