public class PalidromeLinked {

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

    // add first
    public void addFirst(int data){
        // create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // newNode points to head
        newNode.next = head;
        // head = newNode
        head = newNode; // link
    }
    // add last
    public void addLast(int data){
        //if node is empty
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // add at nth
    public void addNth (int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // add node when we arrive at index
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // remove fist
    public int removeFirst () {
        if(size == 0){
            System.out.println("Linked list is empty");
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    // remove last
    public int removeLast () {
        if(size == 0){
            System.out.println("Linked list is empty");
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev: i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size -- ;
        return val;
    }
    // I wrote this one, by myself. So Proud of myself.
    public void delete (int idx) {
        // temp node
        Node temp = head;
        if(head == null){
            // if list is null
            System.out.println("Linked list is empty");
            return;
        }
        else if(size == 1){
            size = 0;
            head = tail = null;
            return;
        }
        else if(idx == size){
            // size--; // This is already defined in below function
            removeLast();
            return;
        }
        else if(idx == 1){
            // size--; // This is already defined in below function
            removeFirst();
            return;
        }
        // iterate to find the index to delete
        // we'll start from 1 so we stop just before, we're exactly on idx.
        int i = 0;
        while(i < (idx-2)){
            temp = temp.next;
            i++;
        }
        // after we reach index, skip current and point to next node.
        size--;
        temp.next = temp.next.next;
    }

    // iterative search
    public int itrSearch (int key) {
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        // key not found
        return -1;
    }

    // recursive search
    public int helper (Node head, int key) {
        if(head == null) {
            return -1;
        }
        
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int recSearch (int key) {
        return helper(head, key);
    }

    // reverse a linked list
    public void reverse () {
        Node prev = null;
        // values assings from right to left
        Node curr = tail = head; // tail is null
        Node next;

        // next = curr.next
        // curr.next = prev
        // prev = curr
        // curr = next
        while(curr != null) {
            // change next to curr's next
            next = curr.next;
            // point backward
            curr.next = prev;
            // change prev to curr
            prev = curr;
            // and curr will point to next/become next;
            curr = next;
        }
        // update head to prev, as curr is NULL now.
        head = prev;
    }    

    // print linked list
    public void print(){
        if(head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // find mid
    public Node findMid (Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my midNode
    }
    public boolean checkPalindrome(){
        // base case
        if(head == null || head.next == null) {
            return true;
        }
        // step 1: find mid
        Node midNode = findMid(head);

        // step 2: reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // step 3: check left == right. i.e 1st half == 2nd half
        while(right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


   public static void main(String [] args) {
        PalidromeLinked ll = new PalidromeLinked();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.print();
        // ll.addNth(1,8);
        // ll.print();
        // ll.addNth(3,9);
        // ll.print();

        // values for palindrome
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        // ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());


        // ll.removeFirst();
        // ll.removeLast();
        // ll.print();
        // System.out.println("Size: "+ll.size);
        // ll.delete(2);
        // ll.print();
        // System.out.println("Size: "+ll.size);
        // ll.delete(2);
        // ll.print();
        // ll.delete(1);
        // ll.print();
        // ll.delete(0);
        // ll.print();
        System.out.println("Size: "+ll.size);
        System.out.println("Iterative search, Index: " + ll.itrSearch(3));
        System.out.println("Iterative search, Index: " + ll.itrSearch(10));
        System.out.println("Recursice search, Index: " + ll.recSearch(3));
        System.out.println("Recursice search, Index: " + ll.recSearch(10));
        // ll.reverse();
        // ll.print();
        // ll.delete(2);
        // ll.print();
        // ll.delete(1);
        // ll.print();
    }
}