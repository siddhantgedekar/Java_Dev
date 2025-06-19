// import input class.
import java.util.*;

// declare class
public class CharPattern{
    // declare main method.
    public static void main(String [] args){
        char a = 'A';
        // take input
        int n;
        // declare scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        n = sc.nextInt();

        for(int line = 1; line <= n; line ++){
            for(int star = 1; star <= line; star ++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}