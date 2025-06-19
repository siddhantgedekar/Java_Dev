public class IsPowerOf2 {
    // check if given number is power of 2 or not
    // using n & n-1
    public static boolean checkPowerOf2 (int n) {
        return (n & (n-1)) == 0;
    }
    public static void main(String [] args) {
        int n = 16;
        System.out.println(checkPowerOf2(n));
    }
}