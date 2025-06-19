import java.util.*;

class NegativePositive {
    public static void main(String [] args){
        // check if input number is positive or negative
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        
        // check the value
        if (number > 0) {
            System.out.println("Positive");
        }
        else if (number == 0) {
            System.out.println("Neither negative or positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}