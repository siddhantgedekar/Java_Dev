public class Pyramid{
    public static void main(String [] args){
        int n = 5;
        String star = "*";
        for(int i=0; i<n; i++){
            for(int k=n-i-1;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2; i>=0; i--){
            for(int k=n-i-1;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}