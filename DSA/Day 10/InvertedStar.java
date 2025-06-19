import java.util.*;

public class InvertedStar {
    public static void main(String [] args){
        // Input
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        n = sc.nextInt();

        // initiate the loop
        for(int line = 1; line <= n; line ++){
            for(int star = 1; star <= (n-line+1); star ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}