public class BitAdd {
    public static int Add (int a) {
        // int bit = 1<<a;
        return -~a;
    }
    public static void main(String [] args) {
        System.out.println(Add(3));
    }
}