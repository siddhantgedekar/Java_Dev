import java.util.*;

public class StarPattern {
    public static void main(String [] args){
        // take number of line as input
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line: ");
        n = sc.nextInt();
        String star = "*";

        // run the loop to print stars.
        // for(int line = 0; line < n; line ++){
        //     for(int star = 0; star < line; star ++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for(int line = 0; line < n; line ++){
            System.out.println(star);
            star += "*";
        }
    }
}