public class NSum {
    public static int SUM (int n) {
        if(n==1){
            return 1;
        }
        int sum1 = SUM(n-1);
        int sum = n + sum1;
        return sum;
    }
    
    public static void main(String [] args) {
        System.out.println(SUM(10));
    }
}