public class ButterflyPattern{
    public static void main(String [] args){
        int n = 10;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(j<=i){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i<=j){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<n/2;i++){
            for(int j=1;j<=n;j++){
                if(j <= i || j > n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n/2;i>0;i--){
            for(int j=1;j<=n;j++){
                if(j <= i || j > n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}