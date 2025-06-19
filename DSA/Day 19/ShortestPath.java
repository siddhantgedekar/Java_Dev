public class ShortestPath {
    public static float sPath (String s) {
        int x = 0, y = 0;
        for(int i=0; i<s.length();i++) {
            if(s.charAt(i) == 'N') {
                x++;
            }
            else if(s.charAt(i) == 'S') {
                x--;
            }
            else if(s.charAt(i) == 'E') {
                y++;
            }
            else {
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String [] args) {
        // direction string
        String dir = "WNEENESENNN";
        System.out.print("Shortest path is: "+sPath(dir));
    }
}