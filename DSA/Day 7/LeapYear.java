import java.util.*;

class LeapYear{
    public static void main(String [] args){
        // determine whether enter value is leap year
        int year;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        year = sc.nextInt();

        // condition
        if(year%4==0){
            // check again
            if(year%100!=0){
                System.out.println(year + " is a Leap Year");
            }
            else{
                // check again
                if(year%400==0){
                    System.out.println(year + " is a Leap Year.");
                }
                else{
                    System.out.println(year + " Not a Leap Year");
                }
            }
        }
        else{
            System.out.println(year + " Not a Leap Year");
        }
    }
}