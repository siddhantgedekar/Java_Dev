import java.util.*;

class Palindrome{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check if palindrome: ");
        int num = sc.nextInt();
        if(pal(num)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    public static boolean pal(int n){
        int org = n;
        int rev = 0;
        while(org!=0){
            rev = rev*10 + org%10;
            org /= 10;
        }
        return rev == n;
    }
}