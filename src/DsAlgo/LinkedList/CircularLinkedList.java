package DsAlgo.LinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void delete(int val){
        if (head.value == val){
            head = head.next;
            tail = head;
            return;
        }

        Node node = head;

        do{
            Node n = node.next;
            if (n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node!=head);
    }

    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.value+"->");
            temp = temp.next;
        }while (temp!= head);
        System.out.println();
    }
}
