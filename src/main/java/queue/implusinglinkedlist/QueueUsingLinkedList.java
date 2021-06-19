package queue.implusinglinkedlist;

class Node {
    Node next;
    int data;
    int size;

    Node(int data) {
        this.data = data;
        next = null;
        size = 0;
    }
}

class MyQueue {
    Node front;
    Node rear;
    int size;

    MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    void enqueue(int data) {
        Node temp = new Node(data);
        if (rear == null && front == null) {
            rear = temp;
            front = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    void deque() {
        front = front.next;
        size--;
    }

    int getFront() {
        return front.data;
    }

    int getReat() {
        return rear.data;
    }

    int getSize() {
        return size ;
    }

    void traversal() {
        Node temp = front;
        System.out.println("Traversal");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    boolean isEmpty() {
        return front == null;
    }

}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.traversal();
        System.out.println(queue.getFront());
        System.out.println(queue.getReat());
        System.out.println(queue.getSize());
        queue.deque();
        queue.traversal();
        System.out.println(queue.getFront());
        System.out.println(queue.getReat());
        System.out.println(queue.getSize());
    }
}
