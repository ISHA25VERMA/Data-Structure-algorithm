package DsAlgo.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedListImplementation myLinkedList = new LinkedListImplementation();
        myLinkedList.insertAtTail(50);
        myLinkedList.insertAtTail(100);
        myLinkedList.insertAtTail(150);
        myLinkedList.insertAtTail(200);
        myLinkedList.insertAtTail(250);
        myLinkedList.insertAtTail(300);
        myLinkedList.display();
        System.out.println();

        reverseList(myLinkedList);
        myLinkedList.display();
        System.out.println();

        myLinkedList.head = reverseUsingRecusrio(myLinkedList.head);
        myLinkedList.display();
    }


    public static void reverseList(LinkedListImplementation list){
        LinkedListImplementation.Node previous = null;
        LinkedListImplementation.Node current = list.head;
        LinkedListImplementation.Node nextPtr;

        while (current!=null){
            nextPtr = current.next;
            current.next = previous;

            previous = current;
            current = nextPtr;
        }
        list.head = previous;
    }

    public static LinkedListImplementation.Node reverseUsingRecusrio(LinkedListImplementation.Node head){
        if (head == null || head.next == null){
            return head;
        }

        LinkedListImplementation.Node newHead = reverseUsingRecusrio(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
