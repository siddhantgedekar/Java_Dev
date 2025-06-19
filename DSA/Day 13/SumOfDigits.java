import java.util.*;

class SumOfDigits{
    public static void main(String [] args){
        // take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("\n***Find Sumd of Digits***\n\nEnter a number: ");
        int a = sc.nextInt();
        int sum = 0;
        while(a != 0){
            sum += a%10;
            a /= 10;
        }
        System.out.println("Sumf of digits is: " + sum);
    }
}