import java.util.LinkedList;

public class IntersectList { // We have to find the intersection part

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
    // find where the intersection point is for these linked lists
    public static int intersect (Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        // int val = 0;
        while(temp1.data != temp2.data) {
            temp2 = temp2.next;
            if(temp2 == null) {
                temp1 = temp1.next;
                temp2 = head2;
            }
        }
        // val = temp2.data;
        return temp2.data;
    }


    // print list
    public static void print (Node temp) {
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

    public static void main(String [] args) {
        // First list
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(6);
        head1.next.next.next.next = new Node(7);

        print(head1);

        // Second list
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = head1.next.next.next;

        print(head2);

        System.out.print("Point of intersection: "+intersect(head1, head2));
    }
}