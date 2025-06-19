public class Fibonacci {
    public static int Fib (int n) {
        if(n==0 || n==1){
            return n;
        }
        int f1 = Fib(n-1);
        int f2 = Fib(n-2);
        int fn = f1 + f2;
        return fn;
    }
    public static void main(String [] args) {
        System.out.println(Fib(6));
    }
}