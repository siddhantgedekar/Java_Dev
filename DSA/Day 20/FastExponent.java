public class FastExponent {
    public static int Exponent (int a, int n) {
        int ans = 1;
        while(n > 0) {
            if((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String [] args) {
        int num = 10;
        System.out.println(Exponent(5, 3));
    }
}