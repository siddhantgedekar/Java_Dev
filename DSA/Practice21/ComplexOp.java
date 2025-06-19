import java.util.*;

public class ComplexOp {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int real1, real2, img1, img2;
        System.out.println("real 1: ");
        real1 = sc.nextInt();
        System.out.println("real 2: ");
        real2 = sc.nextInt();
        System.out.println("img 1: ");
        img1 = sc.nextInt();
        System.out.println("img 2: ");
        img2 = sc.nextInt();
        Complex c = new Complex();
        c.sum(real1,real2,img1,img2);
    }
}

class Complex {
    
    int real1;
    int real2;
    int img1;
    int img2;
    void sum(int real1, int img1, int real2, int img2){
        this.real1 = real1;
        this.real2 = real2;
        this.img1 = img1;
        this.img2 = img2;
        System.out.println("Sum is: "+(real1+real2) + " + " + (img1+img2) + "i");
    }
}