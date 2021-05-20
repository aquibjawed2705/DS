package queue.Implusingarray;


class Queue {
    int ar[];
    int size;

    Queue(int cap) {
        ar = new int[cap];
        size = -1;
    }

    void enqueue(int data) {
        size++;
        ar[size] = data;
    }

    void dequeue() {
        for (int i = 0; i < size; i++) {
            ar[i] = ar[i + 1];
        }
        size--;
    }

    int getFront() {
        return 0;
    }

    int getRear() {
        return size+1;
    }

    boolean isEmpty() {
        return size == -1;
    }

    boolean isFull() {
        return size+1  == ar.length;
    }


    void traversal() {
        System.out.println("Traversal");
        for (int i = 0; i <= size; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}

public class QueueImplUsingArray {


    public static void main(String[] args) {
        Queue queue=new Queue(5);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.enqueue(10);
        /*queue.enqueue(20);
        queue.enqueue(25);
        queue.enqueue(26);
        queue.enqueue(27);*/
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
        queue.traversal();

    }
}

