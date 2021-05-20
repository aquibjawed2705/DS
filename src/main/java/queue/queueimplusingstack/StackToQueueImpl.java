package queue.queueimplusingstack;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    void enqueue(int data) {
        stack1.push(data);
    }

    void dequeue() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    int getSize() {
        return stack1.size();
    }

    int getRear() {
        if(isEmpty())
        {
            return Integer.MAX_VALUE;
        }
        return stack1.peek();
    }

    int getFront()
    {
        if(isEmpty())
        {
            return Integer.MAX_VALUE;
        }
        return stack1.get(0);
    }

    boolean isEmpty()
    {
        return getSize()==0;
    }

    void traversal() {
        System.out.println("Traversal");
        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }

    }

}

public class StackToQueueImpl {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(20);queue.enqueue(20);queue.enqueue(20);queue.enqueue(20);queue.enqueue(20);
        queue.dequeue();
        System.out.println(queue.getSize());
        System.out.println(queue.isEmpty());
        queue.traversal();
    }
}
