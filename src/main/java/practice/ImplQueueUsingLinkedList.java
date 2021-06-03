package practice;

class Queue {
    Node front;
    Node rear;
    int size;

    public Queue() {
        size = 0;
    }

    void enque(int data) {
        Node temp = new Node(data);
        if (front == null && rear == null) {
            rear = temp;
            front = temp;
        }
        else
        {
            rear.next=temp;
            rear=temp;
        }
        size++;
    }

    int deque() {
        if(size==0) return Integer.MIN_VALUE;
        Node temp = front;
        front = front.next;
        size--;
        return temp.data;
    }


    void traverse() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }

}


public class ImplQueueUsingLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enque(10);
        queue.enque(20);
        queue.traverse();
        System.out.println();
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        queue.traverse();
    }

}
