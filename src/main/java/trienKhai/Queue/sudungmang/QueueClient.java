package trienKhai.Queue.sudungmang;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(4);
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(60);
        queue.enqueue(60);
        queue.enqueue(60);
        queue.dequeue();
        queue.dequeue();
        System.out.println("--------------");
        queue.get();
    }
}
