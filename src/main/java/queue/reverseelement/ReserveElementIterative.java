package queue.reverseelement;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReserveElementIterative {

    static void reverse(Queue<Integer> queue)
    {
        Stack<Integer> stack=new Stack<>();
        while (!queue.isEmpty())
        stack.add(queue.poll());
        while (!stack.isEmpty())
        System.out.print(stack.pop() +" ");
    }

    static void reverseRecursive(Queue<Integer> queue)
    {
        if(queue.isEmpty()) return;
        int x=queue.poll();
        reverseRecursive(queue);
        queue.add(x);
    }



    public static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(10);
        queue.add(15);
        queue.add(20);

        System.out.println(queue);
        reverseRecursive(queue);
        System.out.println(queue);


    }
}
