import java.util.*;

public class Builder {
    public static void main(String [] args) {
        StringBuilder sb = new StringBuilder("");
        for(char i='a'; i<='z';i++) {
            sb.append(i);
        }
        System.out.println(sb);
        // sb = "";
        String s = "HELLO WORLD";
        System.out.println(s.toLowerCase());
    }
}