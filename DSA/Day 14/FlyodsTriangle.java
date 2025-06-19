public class FlyodsTriangle{
    public static void main(String [] args){
        // Flyods Triangle
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        // This is how it looks
        // take number of lines
        int n = 4;
        Flyod(n);
    }

    public static void Flyod(int n){
        int number = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}