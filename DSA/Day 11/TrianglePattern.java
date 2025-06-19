public class TrianglePattern{
    public static void main(String [] args){
        int n = 5;
        // this code makes it difficult to change triangle direction
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // this code makes it easy to change triangle direction
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n; j++){
        //         // change condition to i<=j, to change triangle
        //         if(i<=j){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }
        
        // code for butterfly
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                // change condition to i<=j, to change triangle
                if(j<=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                // change condition to i<=j, to change triangle
                if(i<=j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}