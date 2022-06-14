package DsAlgo.Stack;

public class LinkedListStack {
    private class Node{
        int data;
        Node next;
    }

    Node top;

    LinkedListStack(){
        this.top = null;
    }

    public void push(int data){
        // in a stack implemented using linked list overflow is not possible
        // hence it is usually a dynamic stack which keeps on growing

        Node node = new Node();
        node.data = data;
        node.next = top;

        top = node;
    }

    public void pop(){
        if (top == null){
            System.out.println("The stack is empty, cannot pop");
            return;
        }else{
            top = top.next;
        }
    }

    public Boolean isEmpty(){
        if (top == null){
            return true;
        }
        return false;
    }

    public void PrintStack(){
        Node temp = top;

        while (temp.next != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
