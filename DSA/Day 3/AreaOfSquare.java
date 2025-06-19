import java.util.*;

public class AreaOfSquare{
    public static void main(String[] args){
        // side of square
        int a, area;
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of a square: ");
        a = sc.nextInt();
        area = a * a;
        System.out.println("Area of square is: "+area);
    }
}