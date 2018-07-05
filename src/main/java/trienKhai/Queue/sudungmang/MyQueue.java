package trienKhai.Queue.sudungmang;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = 0;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow! Unable to add element: " + item);
        } else {
            queueArr[tail] = item;
            tail++;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue!");
        }
    }

    public void get() {
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queueArr[i] + "\t");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow! Unable to remove element from Queue");
        } else {
            System.out.println("Pop operation done! removed: " + queueArr[head]);
            currentSize--;
            tail--;
            for (int i = 0; i < currentSize; i++) {
                queueArr[i] = queueArr[i + 1];
            }
        }
    }
}
