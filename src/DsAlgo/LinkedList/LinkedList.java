package DsAlgo.LinkedList;
import java.util.List;

public class LinkedList {
    private Node head;
    private Node tail;
    private static int size;
    public LinkedList(){
        this.size = 0;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    //insertion using recursion
    public void insertRec(int val ,int index){
        insertRec(val, index,head);
    }

    private Node insertRec(int val, int index, Node temp){
        if (index == 0){
            insertAtHead(val);
            return temp;
        }
        if (index == 1){
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
            return node;
        }
        return insertRec(val, index-1, temp.next);
    }

    //insertion in linked list
    public void insert(int val){
        Node temp = head;
        while (temp.next!= null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        size+=1;
    }

    public void insertAtHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (tail == null){
            tail = head.next;
        }
        size+=1;
    }

    public void insertAtTail(int val){
        Node newNode = new Node(val);
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
        size+=1;
    }
    public void insertAtIndex(int val, int index){
        if (index == 0){
            insertAtHead(val);
            return;
        }
        if (index == size){
            insertAtTail(val);
            return;
        }
        boolean indexExist = true;
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1 ; i<index; i++){
            if (temp.next != null){
                temp = temp.next;
            }else{
                indexExist = false;
                break;
            }
        }

        if(indexExist){
            newNode.next = temp.next;
            temp.next = newNode;
            size+=1;
        }else {
            System.out.println("index "+index+" does not exist");
        }
    }

    public void deleteFirst(){
        head = head.next;
        size-=1;
    }

    public void deleteLast(){
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        size -=1;
        tail = temp;
    }

    public void deleteAtIndex(int index){
        Node temp = head;
        for (int i = 1; i<index; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size -=1;
    }

    public void displayList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public void reverseListUsingRecursion(){
        reverseListUsingRecursion(head);
    }

    public void reverseListUsingRecursion(Node node){
        if (node.next == null){
            head = node;
            return;
        }
        reverseListUsingRecursion(node.next);
        tail.next = node;
        tail = node;
        node.next = null;
    }

    public void reverseListUsingIteration(){
        Node previous = null;
        Node present = head;
        Node next = head.next;

        while (present != null){
            present.next = previous;
            previous = present;
            present = next;
            if (next!= null){
                next = next.next;
            }
        }

        head = previous;
    }

    public void displaySize(){
        System.out.println(size);
    }
}
