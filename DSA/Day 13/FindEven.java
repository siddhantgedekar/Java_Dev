import java.util.*;

class FindEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(IsEven(a))
            System.out.println("The number is Even.");
        else
            System.out.println("The number is not Even.");
    }

    static boolean IsEven(int n){
        return (n%2 == 0);
    }
}