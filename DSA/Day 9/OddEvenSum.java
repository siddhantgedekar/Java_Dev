import java.util.*;

public class OddEvenSum{
    public static void main(String [] args){
        // get an input integer
        Scanner sc = new Scanner(System.in);
        int n;
        // variables to store sum
        int odd = 0;
        int even = 0;
        System.out.print("Enter an integer: ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            // check for even
            if(i%2==0){
                even += i;
            }
            // check for even
            else{
                odd += i;
            }
        }
        System.out.println("Odd sum: "+odd);
        System.out.println("Even sum: "+even);

        // enter number of elements
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        odd = 0;
        even = 0;
        for(int i=0;i<n;i++){
            // take individual elements
            int x = sc.nextInt();

            if(x%2==0){
                even += x;
            }
            else{
                odd += x;
            }
        }
        System.out.println("*********************");
        System.out.println("Odd sum: "+odd);
        System.out.println("Even sum: "+even);
    }
}