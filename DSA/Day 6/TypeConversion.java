public class TypeConversion{
    public static void main(String args[]){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        System.out.println((f*b) + (i%c) - (d*s));
        int j = 100;
        float k = j;
        double l = k;
        System.out.print("Real value of l is: "+l);
    }
}