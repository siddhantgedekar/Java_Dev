import java.util.*;

class Average {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter 1st number: ");
        a = sc.nextInt();
        System.out.print("Enter 1st number: ");
        b = sc.nextInt();
        System.out.print("Enter 1st number: ");
        c = sc.nextInt();
        System.out.println("Average of three numbers is: "+avg(a,b,c));
    }

    static float avg(int a, int b, int c){
        return (a+b+c)/3;
    }
}