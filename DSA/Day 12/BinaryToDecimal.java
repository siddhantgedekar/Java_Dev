import java.util.*;

class BinaryToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // declare the variables
        // NOTE: In java number starting with 0 considered as an Octal hence there's a change in value.
        int binary = 0;
        System.out.print("Enter a binary number: ");
        binary = sc.nextInt();
        int decimal = 0;
        int position = 0;

        while(binary != 0){ // run until binary value is not zero
            decimal = binary%10 * power(2, position) + decimal; // take last digit multiply by 2 power then add previous value of decimal.
            binary = binary / 10; // decrease value
            position++; // increase the position, which is power
        }
        System.out.print("Decimal value is: " + decimal);
    }

    public static int power(int n, int power){
        // if(power == 0){ // if power already 0 then return 1
        //     return 1;
        // }
        // else if(power == 1){
        //     return 2;
        // }
        // else return n to power Power.
        // ABOVE CODE IS GOOD AS WELL, BUT JUST LEANRED ABOUT TERNARY OPERATOR
        // THAT WE CAN DO SOMETHING LIKE THAT.
        for(int i=1; i<power; i++){
            n *= 2;
        }
        // check if value is zero, true then return 1
        // else check power == 1, true then return 2;
        // else return n;
        // THIS LOOKS LIKE NESTED TERNARY OPERATOR.
        return power == 0 ? 1 : power == 1 ? 2 : n;
    }
}