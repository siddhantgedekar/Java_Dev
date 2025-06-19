class Rhombus {
    public static void main(String[] args){
        int size = 5;
        for(int i=0;i<size;i++){
            for(int k=i+1;k<size;k++){
                System.out.print(" ");
            }
            for(int j=0;j<size;j++){
                if(i == 0 || j == size-1 || i == size-1 || j == 0){
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