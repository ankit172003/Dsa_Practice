package Alpha.LinkedList;

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    /* Methods
    add() - add First
     1. create new node
     2. new node next point current head
     3. shift head to new node */

    public void addfirst( int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            // keeping safe side if ll is empty
            // then we have to add first element and set that as
            // head and tail
            head = tail = newNode;
            return;

        }
        newNode.next =head;

        head=newNode;
    }

    /* Methods
    add() - add Last
     1. create new node
     2. current tail next!= null next = newNode
     3. shift tail to new node */
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;

        tail = newNode;

    }

    // method - print ll
    public void printing(){
        Node i = head;
        while(i != null){
            System.out.print(i.data + " ");
            i=i.next;
        }
        System.out.println();
    }

    // method addInMiddle - with index
    public void addInMiddle(int index, int data){

        if(index == 0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;

        while(i < index-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method - removeFirst
    public int removeFirst(){
        if(size == 0){
            return -1;
        }else if(head.next == null){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    // Method - removeLast
    public int removeLast(){

        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        int i = 0;
        while(i <size-2){
            prev = prev.next;
            i++;
        }

        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;


    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);

        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.addInMiddle(3,100);

        System.out.print("LL after Adding : ");
        ll.printing();
        System.out.println("size of th Linked List = " + size);
        System.out.println("Element removed from Start = "+ll.removeFirst());
        System.out.println("Element removed from Last = " + ll.removeLast());
        System.out.print("LL after Removing : ");
        ll.printing();
        System.out.println("size of th Linked List = " + size);


    }
}
