package Alpha.LinkedList;

public class Find_Remove_FromEnd {

    public static class Node{

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


    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(size == 0){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    private void removing_fromEnd(int index) {
        Node i = head;
        //calculate size of linked list as there no size exist in contest ike here we have created
        int sz = 0;
        while(i!=null){
            i = i.next;
            sz++;
        }

        if (index == sz){
            head = head.next; // removeFirst only as there is only 1 node
            return;
        }
        int itr = 1;
        int indexToReach = sz-index; // we will go to one previous
        Node temp = head;
        while(itr < indexToReach){
            temp = temp.next;
            itr++;
        }
        temp.next = temp.next.next;
        return;

    }

    public void printing(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Find_Remove_FromEnd ll = new Find_Remove_FromEnd();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.printing();

        ll.removing_fromEnd(3);

        ll.printing();
    }


}
