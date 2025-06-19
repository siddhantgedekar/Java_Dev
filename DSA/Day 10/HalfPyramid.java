import java.util.*;

public class HalfPyramid{
    public static void main(String [] args){
        // get input number
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        n = sc.nextInt();

        // initiate the loop
        for(int line = 1; line <= n; line ++){
            for(int number = 1; number <= line; number ++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}