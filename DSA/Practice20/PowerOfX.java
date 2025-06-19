public class PowerOfX {
    public static int powerX (int a, int x) {
        int ans = 1;
        while(x > 0){
            if((x & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            x = x>>1;
        }
        return ans;
    }
    public static void main(String [] args) {
        System.out.println(powerX(5, 3));
    }
}