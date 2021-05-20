package stack.linkedlistbasedimpl;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class MyStack {
    Node head;
    int size;

    MyStack() {
        head = null;
        size = 0;
    }

    void push(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop() {
        Node temp = head.next;
        head.next = null;
        head = temp;
        size--;
        return temp.data;
    }

    boolean isEmpty() {
        return size == -1;
    }

    int size() {
        return size;
    }

    int peek() {
        return head.data;
    }

    void traversal() {
        Node temp=head;
        System.out.println("Traversal");
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

}

public class StackUsingLinkedLink {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(8);
        stack.traversal();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.traversal();
        System.out.println(stack.isEmpty());
    }

}
