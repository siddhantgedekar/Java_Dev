// import scanner class
import java.util.*;

public class AverageNumber {
    public static void main(String[] args){
        // input 3 numbers
        int a, b, c, avg;

        // scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A: ");
        a = sc.nextInt();
        System.out.println("Enter number B: ");
        b = sc.nextInt();
        System.out.println("Enter number C: ");
        c = sc.nextInt();

        // calculate average
        avg = (a+b+c)/3;
        // print avg
        System.out.println("Average of 3 numbers: " + avg);
    }
}