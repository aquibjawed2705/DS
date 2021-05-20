package linkedlist.doublylinkedlist;

public class DoublyLInkedListOperation {
    public static void main(String[] args) {
        DoublyLinkedListNode head=new DoublyLinkedListNode(10);
        DoublyLinkedListNode temp=new DoublyLinkedListNode(20);
        DoublyLinkedListNode temp1=new DoublyLinkedListNode(30);
        head.next=temp;
        temp.prev=head;
        temp.next=temp1;
        temp1.prev=temp;
        traverseNode(null);
    }

    public static void traverseNode(DoublyLinkedListNode head) {
        DoublyLinkedListNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
    }


}
