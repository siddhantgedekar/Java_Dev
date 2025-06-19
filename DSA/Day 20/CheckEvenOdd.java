public class CheckEvenOdd {
    public static void evenOdd (int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    // get ith bit
    public static int getIthBit (int n, int i) {
        // left shift will, move 1 to left by i'th place.
        int bitMask = 1<<i;
        // doing & with n and bitmask will check if ith place in n and ith place in bitmask results in even or odd
        // based on that we'll determine whether it's 0 or 1 at ith place.
        if((n&bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    // set ith bit then find the change in actual number;
    public static int setIthBit (int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    // clear ith bit
    public static int clearIthBit (int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    // update bit
    public static int updateIthBit (int n, int i, int updateVal) {
        if(updateVal == 0) {
            return clearIthBit(n, i);
        }
        else {
            return setIthBit(n, i);
        }

        // n = clearIthBit(n, i);
        // int bitMask = updateVal<<i;
        // return n | bitMask;
    }

    // clear last 2 bits
    public static int clearLastTwo (int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String [] args) {
        int a = 10;
        evenOdd(a);
        System.out.println(getIthBit(a,1));
        System.out.println(setIthBit(a,1));
        System.out.println(updateIthBit(a, 2, 1));
        // clear last two
        System.out.println(clearLastTwo(15, 2));
    }
}