public class SwapNum {
    public static void Swap (int a, int b) {
        // swap values without using 3rd variable
        // I already know how to use it.
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap a & b: "+a+" "+b);
    }
    public static void main(String [] args) {
        System.out.println("Before swap a & b: "+2+" "+3);
        Swap(2,3);
    }
}