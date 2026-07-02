package Alpha.LinkedList;

public class Search_LinkedList {

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

    public int iterative(int data){
        int index = 1;
        Node temp = head;
        while (temp != null){
            if(temp.data == data){
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;

    }

    public int recursiveSearch(int index, int data, Node temp){
        if(temp.data == data){
            return index;
        }
        else if (temp.next == null){
            return -1;
        }
        temp = temp.next;
        int search = recursiveSearch(index+1,data, temp);
        if(search >=0){
            return search;
        }
        return -1;
    }

    public void printing(){
        Node i = head;
        while(i != null){
            System.out.print(i.data +" ");
            i = i.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Search_LinkedList ll = new Search_LinkedList();
        ll.addFirst(50);
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.printing();
        System.out.println("Data found on index : "+ ll.iterative(10));
        System.out.println("Recursive Search Data : "+ll.recursiveSearch(1,50,head));
    }
}
