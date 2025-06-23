// Detect cycle in linked list

public class Cycle {

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
            if(temp == head){
                System.out.println(" <<Cycle detected>>");
                return;
            }
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

    // check if ll has cycle
    public boolean isCycle () {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if(slow == fast) {
                return true; // cycle exist
            }
        }
        return false; // cycle doesn't exists
    }

    // remove cycle
    public void removeCycle () {
        // Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle -> last.next = null
        prev.next = null;
    }

    public Node getMid (Node head) {
        // slow fast approach
        Node slow = head;
        Node fast = head.next;
        // LOOP
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // return mid
    }

    // merge the list
    public Node merge (Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    // Merge sort in linked list
    public Node mergeSort (Node head) {
        if(head == null || head.next == null){ 
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // compare left and right
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        Cycle ll = new Cycle();
        
        // add elements
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        // connect like this 
        tail.next = head.next;
        // OR connect like this
        // head.next.next.next = head.next; // linking to make a cycle in linked list.
        System.out.println("Cycle exists: " + ll.isCycle());
        // ll.print();
        ll.removeCycle();
        System.out.println("Cycle exists: " + ll.isCycle());
        ll.print();
        // merge sort
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}