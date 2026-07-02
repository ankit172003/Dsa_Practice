package Alpha.LinkedList;

public class ReverseLL {

    public class Node{
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

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(size == 0){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void reversePrint(){
        Node prev =  null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next; // 2
            curr.next = prev; // null
            prev = curr; //1
            curr = next; //2
        }
        head = prev;

    }

    public void printing(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.printing();

        ll.reversePrint();
        ll.printing();
    }
}
