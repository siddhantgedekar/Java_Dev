import java.util.*;

public class Factorial{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int ans = 1;
        int i = 1;

        while(i<=n){
            ans *= i;
            i++;
        }
        System.out.println("Factorial: " + ans);
    }
}