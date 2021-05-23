package linkedlist.reverseList;

import linkedlist.singlelinkedlist.Node;

public class ReverseLinkedList {


    static Node reverse(Node head) {
        if (head == null) return head;
        Node prev = null;
        Node current = head;
        Node next=null;
        while (current != null) {
          next=current.next;
          current.next=prev;
          prev=current;
          current=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        Node temp = head;
        System.out.println("Before....");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        Node temp1 = reverse(head);
        System.out.println("\nAfter.....");
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }

    }
}
