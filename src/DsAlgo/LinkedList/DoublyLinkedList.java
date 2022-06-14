package DsAlgo.LinkedList;

import java.net.InetSocketAddress;

public class DoublyLinkedList {

    private Node head;
    int size;
    private class Node{
        int value;
        Node previous;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        public Node(int value, Node previous, Node next){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    public DoublyLinkedList(){
        this.size = 0;
    }

    //insert at head
    public void insertAtHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.previous = null;
        if (head != null){
            head.previous = newNode;
        }
        head = newNode;

        size+=1;
    }

    public void insertAtEnd(int val){
        if(head == null){
            insertAtHead(val);
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        newNode.previous = temp;
        size+=1;
//        Node newNode = new Node(val,)
    }

    public void insertAtIndex(int value, int index){
        Node temp = head;
        for (int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value);
        node.previous = temp;
        node.next = temp.next;
        temp.next.previous = node;
        temp.next = node;
        size+=1;
    }

    public void display(){
        System.out.print(head.previous+"<->");
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+"<->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void displayReverse(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        while (temp != null){
            System.out.print(temp.value+"<->");
            temp = temp.previous;
        }
        System.out.println("null");
    }


}
