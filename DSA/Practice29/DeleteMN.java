public class DeleteMN {

    // I'll have to create a custom linked list
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add methods
    // Add First
    public void addFirst (int data) {
        Node newNode = new Node(data);
        size++;
        // if empty
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // add at first
        newNode.next = head;
        head = newNode;
    }
    // Add Last
    public void addLast (int data) {
        Node newNode = new Node(data);
        size++;
        // if empty
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // add at last
        tail.next = newNode;
        tail = newNode;
    }

    // delete at nth
    public static void deleteNth (int idx) {
        // Find nth node
        Node t = head;
        int i = 0;
        while(i != (idx-2)) {
            t = t.next;
            i++;
        }
        // once found, delete that node.
        size--;
        t.next = t.next.next;
    }

    // print list
    public static void print () {
        Node temp = head;
        // if empty
        if(temp == null) {
            System.out.println("List is empty");
            return;
        }
        // Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // take starting node and delete count
    public static Node delN (Node head1, int n) {
        // go 0 to n
        int i = 0;
        while(head1.next != null && i != n) {
            // change current address to new one.
            head1.next = head1.next.next;
            // count deletion
            i++;
        }
        // return current node/address
        return head1.next;
    }

    // Delete N nodes after M nodes traveresed.
    public static void MToN (int m, int n) {
        Node t = head;
        
        // start from 1st node, not 0th.
        int curr = 1;

        while(t != null) {
            // if we skipped m nodes, then delete n nodes
            if(curr == m) {
                // delete n nodes
                t = delN(t, n);
                // start over
                curr = 1;
            }
            else{
                // move to next node
                t = t.next;
                // increase skips.
                curr++;
            }
        }
    }

    public static void main(String [] args) {
        DeleteMN ll = new DeleteMN();

        // run loop to add numbers in list
        for(int i=12;i>=1;i--){
            ll.addFirst(i);
        }

        System.out.println("\tBefore deleting specific nodes.");
        ll.print();
        // check list size
        // System.out.println("Size: " + size);
        // call func
        ll.MToN(3,2);
        // check list update
        System.out.println("\n\tAfter  deleting specific nodes.");
        ll.print();
    }
}