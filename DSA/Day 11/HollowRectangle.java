public class HollowRectangle{
    public static void main(String [] args){
        int n = 5, m = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i == 1 || i == n || j == 1 || j == m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            // if(i == 0 || i == 4){
            //     for(int j=0; j<5; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // else{
                // for(int j=0;j<5;j++){
                //     if(j==0 || j==4){
                //         System.out.print("*");
                //     }
                //     else{
                //         System.out.print(" ");
                //     }
                // }
            // }
        }
    }
}