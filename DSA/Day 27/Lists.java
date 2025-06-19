import java.util.ArrayList;
import java.util.Collections;

public class Lists {
    public static void main(String [] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        // Get
        System.out.println(list.get(0));
        // remove
        list.remove(2);
        System.out.println(list);
        // set element at index
        list.set(2, 10);
        System.out.println(list);
        // perform sorting, swap and reverse print the ArrayList
        // in-built function Collections.sort(list);
        // reverse order Collections.sort(list, Collections.reverseOrder);
        
        // # Multidimensional ArrayList
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        // adding previous list to 2D mainlist
        mainlist.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        mainlist.add(list2);
        System.out.println(mainlist + "\n__________________");
        for(int i=0; i<mainlist.size();i++) {
            ArrayList<Integer> currList = mainlist.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }
}