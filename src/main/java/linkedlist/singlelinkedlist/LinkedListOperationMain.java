package linkedlist.singlelinkedlist;

public class LinkedListOperationMain {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next=new Node(30);
        //traverseNode(head);
        // head=insertAtBeginning(head,40);
        //traverseNode(head);
        // head=insertAtEnd(head,50);
        //head=insertAtEnd(null,60);
        //traverseNode(head);
        //head= deleteFirstNode(head);
        //traverseNode(head);
        //head = deleteLastNode(head);
       // head=insertAtGivenPosition(head,4,8);
        //traverseNode(head);
       /* int pos=searchListData(head,30);
        int res=searchRecursiveListData(head,30);
        System.out.println("Position :"+pos);
        System.out.println("Position recurision :"+res);*/
        System.out.println(isPalindrome(head));
    }

    static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node rev = revese(slow.next);
        Node temp=head;
        while (rev != null) {
            if (temp.data != rev.data) {
                return false;
            }
            rev=rev.next;
            temp=temp.next;
        }

        return true;
    }

    private static Node revese(Node head) {
        Node curr=head;
        Node prev=null;
        Node next=null;

        while (curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

    private static Node insertAtEnd(Node head, int data) {
        Node temp = new Node(data);
        Node temp1 = head;
        if (temp1 == null) {
            return temp;
        }
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
        temp1.next = temp;
        return head;
    }

    private static Node insertAtBeginning(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    private static void traverseNode(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static Node deleteFirstNode(Node head) {
        if (head == null) {
            return null;
        }
        return head.next;
    }

    private static Node deleteLastNode(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node insertAtGivenPosition(Node head,int position,int data) {
        Node temp = head;
        if (head == null || position==1) {
            return insertAtBeginning(head,data);
        }

        for (int i = 1; i <= (position - 2) && temp != null; i++) {
            if (temp == null) {
                System.out.println("Invalid Position");
                return head;
            } else {
                temp = temp.next;
            }
        }
        Node newNode = new Node(data);
        if (temp == null) {
            System.out.println("Invalid Position");
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static int searchListData(Node head, int data) {
        int position = 1;
        Node temp = head;
        if (head == null) {
            return -1;
        }
        while (temp.next != null) {
            if (temp.data == data) {
                return position;
            } else {
                position++;
                temp = temp.next;
            }
        }
        return -1;
    }

    public static int searchRecursiveListData(Node head, int data) {
        if(head==null)
        {
            return -1;
        }
        if(head.data==data)
        {
            return 1;
        }
        int res=searchRecursiveListData(head.next,data);
        if (res==-1) return -1;
        else
            return res+1;
    }
}
