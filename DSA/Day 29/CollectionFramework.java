import java.util.LinkedList;

public class CollectionFramework extends Cycle {

    public static void main(String [] args) {
        // create linked list
        LinkedList<Integer> ll = new LinkedList<>();

        // add operation
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0->1->2
        System.out.println(ll);
    }
}