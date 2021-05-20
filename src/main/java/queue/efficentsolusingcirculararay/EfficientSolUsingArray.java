package queue.efficentsolusingcirculararay;


class Queue {
    int ar[];
    int size;
    int front;

    Queue(int cap) {
        ar = new int[cap];
        size = 0;
        front = 0;
    }

    void enqueue(int data) {
        int rear = getRear();
        rear = (rear + 1) % ar.length;
        ar[rear] = data;
        size++;
    }

    void dequeue() {
        size--;
        front = (front + 1) % ar.length;
    }

    int getFront() {
        return front;
    }

    int getRear() {
        return (front + size - 1) % ar.length;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == ar.length;
    }

    void traversal() {
        System.out.println("Traversal");
        if (getRear() < front) {
            for (int i = getFront(); i < ar.length; i++) {
                System.out.print(ar[i] + " ");
            }
            for (int i = 0; i <= getRear(); i++) {
                System.out.print(ar[i] + " ");
            }
        } else {
            for (int i = getFront(); i <= getRear(); i++) {
                System.out.print(ar[i] + " ");
            }
        }
        System.out.println();
    }
}

public class EfficientSolUsingArray {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(25);
        queue.enqueue(26);
        queue.enqueue(27);
        queue.traversal();
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
        queue.dequeue();
        queue.traversal();
        queue.enqueue(28);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        //queue.dequeue();
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
        queue.traversal();
    }
}



