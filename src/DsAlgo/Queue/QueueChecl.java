package DsAlgo.Queue;

public class QueueChecl {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.push(4);
        queue.push(4);
        queue.push(4);
        queue.printQueue();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.printQueue();
    }
}
