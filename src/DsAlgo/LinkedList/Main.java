package DsAlgo.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Linked LIST
        LinkedList myLinkedList = new LinkedList();
        System.out.println(myLinkedList);
        myLinkedList.insertAtHead(4);
        myLinkedList.insertAtHead(5);
        myLinkedList.insertAtHead(6);
        myLinkedList.insertAtHead(7);
        myLinkedList.insertAtTail(3);
//        myLinkedList.displaySize();
        myLinkedList.insertRec(10,0);
        myLinkedList.displayList();
//        myLinkedList.reverseListUsingRecursion();
        myLinkedList.reverseListUsingIteration();
        myLinkedList.displayList();
//        myLinkedList.displayList();
//        myLinkedList.displaySize();
//        myLinkedList.insertAtIndex(10,4);
//        myLinkedList.displayList();
//        myLinkedList.displaySize();
//        myLinkedList.insertAtIndex(20,10);
//        myLinkedList.insertAtIndex(20,7);
//        myLinkedList.displayList();
//        myLinkedList.displaySize();
//        myLinkedList.insertAtIndex(0,0);
//        myLinkedList.displayList();
//        myLinkedList.deleteFirst();
//        myLinkedList.displayList();
//        myLinkedList.deleteLast();
//        myLinkedList.displayList();
//        myLinkedList.displaySize();
//        myLinkedList.deleteAtIndex(2);
//        myLinkedList.displayList();
//        myLinkedList.displaySize();

        //doubly linked list
//        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList();
//        myDoublyLinkedList.insertAtHead(6);
//        myDoublyLinkedList.insertAtHead(7);
//        myDoublyLinkedList.insertAtHead(8);
//        myDoublyLinkedList.display();
//        myDoublyLinkedList.displayReverse();
//        myDoublyLinkedList.insertAtEnd(5);
//        myDoublyLinkedList.display();
//        myDoublyLinkedList.insertAtIndex(9,2);
//        myDoublyLinkedList.display();

        // Circular Linked List

//        CircularLinkedList myCircularLinkedList = new CircularLinkedList();
//        myCircularLinkedList.insert(4);
//        myCircularLinkedList.insert(7);
//        myCircularLinkedList.insert(14);
//        myCircularLinkedList.insert(1);
//        myCircularLinkedList.insert(15);
//        myCircularLinkedList.display();
//        myCircularLinkedList.delete(14);
//        myCircularLinkedList.display();
    }
}
