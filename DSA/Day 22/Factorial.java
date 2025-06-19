public class Factorial {
    public static int Fact (int n) {
        if(n==0){
            return 1;
        }
        int fm1 = Fact(n-1);
        int fn = n * Fact(n-1);
        return fn;
    }
    public static void main(String [] args) {
        System.out.println(Fact(5));
    }
}