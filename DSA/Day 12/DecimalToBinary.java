import java.util.*;

class DecimalToBinary{
    public static void main(String[] args){
        // take input
        int dec = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        dec = sc.nextInt();
        int temp = dec;
        
        String binary = "";
        while(dec != 0){
            // first take modulo with 2 and store it
            binary = dec%2 + binary;
            // second divie the dec by 2
            dec /= 2;
        }
        System.out.println("This is stored STRING: "+ binary);

        // ABOVE CODE WILL STORE THE INTEGER GENERATED INTO STRING

        // WE'LL CODE NOW TO STORE INTO INTEGER
        int newBin = 0;
        int power = 0;
        while(temp != 0){
            newBin = temp%2 * (int)Math.pow(10, power) + newBin; // Math.pow() function returns double hence narrow casting.
            temp /= 2;
            power++;
        }
        System.out.print("This is stored in INT: " + newBin);
    }
}