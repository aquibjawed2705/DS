package practice;

class Stack {
    Node head;
    int size;

    public Stack() {
        size = 0;
    }

    void push(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop() {
        if (size == 0)
            return Integer.MIN_VALUE;
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    int peek() {
        if (size != 0)
            return head.data;
        else
            return Integer.MIN_VALUE;
    }

    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


public class ImplStackUsingLinkedList {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.traverse();
        System.out.println("\nPop " + stack.pop());
        System.out.println("Peek " + stack.peek());
        stack.traverse();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
