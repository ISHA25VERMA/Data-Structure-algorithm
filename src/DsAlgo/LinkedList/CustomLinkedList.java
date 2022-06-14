package DsAlgo.LinkedList;

class LinkedListImplementation{
    Node head;
       static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    //insertion code
    public void insertAtHead(int data){
          Node n = new Node(data);
          n.next = head;
          head = n;
    }

    public void insertAtTail(int data){
          if (head == null){
              head = new Node(data);
              return;
          }
          Node temp = head;
          while (temp.next != null){
              temp = temp.next;
          }
          temp.next = new Node(data);
    }

    public void insertAtNth (int data, int position){

          Node n = new Node(data);

          if(this.head == null){
              this.head = n;
              return;
          }

          if (position == 1){
              n.next = head;
              head = n;
              return;
          }

          Node current = head;
          Node previous = null;

          int i  =0;
          while (i<position-1){
              previous = current;
              current = current.next;

              if(current == null){
                  break;
              }

              i++;
          }

          n.next = current;
          if (previous!=null){
              previous.next = n;
          }
//          Node temp = head;
//          int i = 1;
//          while (i<position){
//              temp = temp.next;
//              i++;
//          }
//          n.next = temp;
//          i = 1;
//          temp = head;
//          while (i<position-1){
//              temp = temp.next;
//              i++;
//          }
//          temp.next = n;
    }

    //deletion in list
    public void deleteUsingPosition(int position){
          if (head == null){
              return;
          }

          if (head.next == null){
              if(position == 1){
                  head = null;
              }
              return;
          }
          if (position == 1){
              head = head.next;
              return;
          }
          Node temp = head;
          int i =1;
          while (i<position-1){
              temp = temp.next;
              i++;
          }
          temp.next = temp.next.next;
    }

    public void deleteAtHead(){

          if (head.next == null){
              head = null;
              return;
          }
          head = head.next;
    }


    //traversal of linked list
    public void display(){
        Node n = head;
        while (n != null){
            System.out.println(n.data+" "+n.next);
            n = n.next;
        }
    }
}

public class CustomLinkedList {

    public static void main(String[] args) {
        LinkedListImplementation myLinkedList = new LinkedListImplementation();

        myLinkedList.display();
        System.out.println("\nnext");

        //manual addition of nodes at tail
        myLinkedList.head = new LinkedListImplementation.Node(100);

        myLinkedList.head.next = new LinkedListImplementation.Node(200);

        LinkedListImplementation.Node node3 = new LinkedListImplementation.Node(300);
        myLinkedList.head.next.next = node3;

        LinkedListImplementation.Node node4 = new LinkedListImplementation.Node(400);
        node3.next = node4;

        myLinkedList.display();
        System.out.println();

        //addition at tail with the help of function
        myLinkedList.insertAtTail(500);

        myLinkedList.display();
        System.out.println();

        //insertion at head with the help of function
        myLinkedList.insertAtHead(50);

        myLinkedList.display();
        System.out.println();

        //insertion at nth position
        myLinkedList.insertAtNth(250, 4);
        myLinkedList.display();
        System.out.println();

        myLinkedList.insertAtNth(300, 1);
        myLinkedList.display();
        System.out.println();

        myLinkedList.insertAtNth(550, 9);
        myLinkedList.display();
        System.out.println();


        myLinkedList.deleteUsingPosition(5);
        myLinkedList.display();
        System.out.println();

        myLinkedList.deleteUsingPosition(1);
        myLinkedList.display();
        System.out.println();

        myLinkedList.deleteAtHead();
        myLinkedList.display();
        System.out.println();

        myLinkedList.deleteUsingPosition(6);
        myLinkedList.display();
    }
}