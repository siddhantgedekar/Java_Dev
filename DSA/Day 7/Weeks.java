import java.util.*;

class Weeks {
    public static void main(String [] args){
        // we have to print day of week name using the input number from 1-7
        int week;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter week number: ");
        // simple way, if not using modulo operator
        week = sc.nextInt();
        // a little advance when using modulo. 
        week %= 7;

        switch (week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("I think you have an advance algorithm that I don't seem to understand");
        }

        // if (week == 1){
        //     System.out.println("Monday");
        // }
        // else if (week == 2){
        //     System.out.println("Tuesday");
        // }
        // else if (week == 3){
        //     System.out.println("Wednesday");
        // }
        // else if (week == 4){
        //     System.out.println("Thursday");
        // }
        // else if (week == 5){
        //     System.out.println("Friday");
        // }
        // else if (week == 6){
        //     System.out.println("Saturday");
        // }
        // else if (week == 7){
        //     System.out.println("Sunday");
        // }
        // else{
        //     System.out.println("Out of the weeks");
        // }
    }
}