public class SimpleExpression {
    public static void main(String[] args){
        int x, y, z;
        // assining values
        x=y=z=2;
        // add y to x
        x += y;
        // substract z from y
        y -= z;
        // divide z by (x+y)
        z /= (x+y);
        // print all the values.
        System.out.println(x+" "+y+" "+z);
    }
}