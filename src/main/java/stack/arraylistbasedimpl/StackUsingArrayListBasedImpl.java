package stack.arraylistbasedimpl;

import java.util.ArrayList;

class MyStack {
    ArrayList<Integer> al;

    MyStack() {
        al = new ArrayList<>();
    }

    void push(int data) {
        al.add(data);
    }

    int pop() {
        int res = al.get(al.size() - 1);
        al.remove(al.size() - 1);
        return res;
    }

    int peek() {
        return al.get(al.size() - 1);
    }

    int size() {
        return al.size();
    }

    void traversal() {
        System.out.println("\nTraversal");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

    boolean isEmpty() {
        return al.isEmpty();
    }

}

public class StackUsingArrayListBasedImpl {

    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.traversal();
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println(myStack.isEmpty());
        myStack.traversal();
    }
}
