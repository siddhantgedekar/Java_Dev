public class Recursion {
    public static int Nto1 (int n) {
        if(n==0){
            return 0;
        }
        else{
            System.out.print(" "+n);
            return Nto1(n-1);
        }
    }
    public static int OneN (int n, int i) {
        if(i==n){
            System.out.print(" "+i);
            return n;
        }
        System.out.print(" "+i);
        return OneN(n, i+1);
    }
    public static void main(String [] args) {
        int n = 10;
        Nto1(n);
        OneN(n, 1);
    }
}