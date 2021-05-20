package stack.arraybasedimpl;


class MyStack{
    int top;
    int capacity;
    int ar[];

    MyStack(int capacity)
    {
        this.capacity = capacity;
        top=-1;
        ar=new int[capacity];
    }

    void push(int data)
    {
        if(top==capacity-1)  return ;
        top++;
        ar[top]=data;
    }

    int pop()
    {
        if(isEmpty())
            return Integer.MAX_VALUE;
       int data= ar[top];
       top--;
       return data;
    }

    int peek()
    {
        if(isEmpty())
        return Integer.MAX_VALUE;
        return ar[top];
    }

    int size()
    {
        return top+1;
    }

    void  traversal()
    {
        for (int i=0;i<=top;i++) {
            System.out.print(ar[i]+" ");
        }
    }

    boolean isEmpty()
    {
        return top==-1;
    }

}

public class StackImplUsingArray {
    public static void main(String[] args) {
        MyStack stack=new MyStack(5);
        stack.push(5);
        stack.push(50);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        stack.push(5);
        stack.push(50);
        System.out.println(stack.pop()); System.out.println(stack.pop()); System.out.println(stack.pop());
        stack.traversal();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
    }

}
