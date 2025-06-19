import java.util.*;

public class StringCompare {
    public static void main(String [] args) {
        String str = "Hello World";
        String str2 = "By world";
        String str3 = "Hello World";
        String str4 = new String("Hello World");
        System.out.println(str.equals(str3));
        System.out.println(str.equals(str2));
        System.out.println(str.equals(str4));
    }
}