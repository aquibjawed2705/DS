package practice;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedList {

    static Node insertAtBeginning(int data, Node head) {
        if (head != null) {
            Node temp = new Node(data);
            temp.next = head;
            return temp;
        }
        return null;
    }

    static void insertAtEnd(int data, Node head) {
        if (head == null) {
            return;
        }
        Node temp = new Node(data);
        Node temp1 = head;
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
        temp1.next = temp;
    }

    static Node insertAtgivenPosition(int data, int position, Node head) {
        if (head == null) {
            return null;
        }
        if (position == 1) {
            return insertAtBeginning(data, head);
        }
        Node temp = head;
        Node temp1 = temp;
        for (int i = 0; i < position; i++) {
            if (temp != null) {
                if (i == position - 1) {
                    Node temp2 = new Node(data);
                    temp1.next = temp2;
                    temp2.next = temp;
                }
                temp1 = temp;
                temp = temp.next;
            } else {
                break;
            }
        }
        return head;
    }

    static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static Node deleteFirstNode(Node head) {
        if (head == null) {
            return null;
        } else {
            return head.next;
        }
    }

    static Node deletelastNode(Node head) {
        Node temp = head;
        Node temp1 = temp;
        if (temp == null) {
            return null;
        }
        if (temp.next == null) {
            return null;
        }
        while (temp.next != null) {
            temp1 = temp;
            temp = temp.next;
        }
        temp1.next = null;
        return head;
    }

    public static Node deleteGivenNode(int data, Node head) {
        Node temp = head;
        Node temp1 = temp;
        if (temp == null) {
            return null;
        }
        while (temp != null) {
            if (temp.data == data) {
                if (temp.next != null) {
                    temp.data = temp.next.data;
                    temp.next = temp.next.next;
                } else {
                    temp1.next = null;
                }
            }
            temp1 = temp;
            temp = temp.next;
        }
        return head;
    }

    public static int searchNode(int data, Node head) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return data;
            }
            temp = temp.next;
        }
        return Integer.MIN_VALUE;
    }

    public static int middleOfLinkedList(Node head) {
        Node slow = head;
        Node fast = head;
        if (fast == null) {
            return Integer.MIN_VALUE;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    static Node evenOddElements(Node head) {
        Node temp = head;
        Node evenStart = null, evenEnd = null, oddStart = null, oddEnd = null;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                if (evenStart == null) {
                    evenStart = temp;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = temp;
                    evenEnd = evenEnd.next;
                }
            } else {
                if (oddStart == null) {
                    oddStart = temp;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = temp;
                    oddEnd = oddEnd.next;
                }
            }
            temp = temp.next;
        }
        if (oddStart == null || evenStart == null)
            return head;
        oddEnd.next = evenStart;
        evenEnd.next = null;
        return oddStart;
    }

    static Node revereElement(Node head)
    {
        Node temp=head;
        Node temp1=temp.next;
        temp.next=null;
        Node temp2=null;
        while(temp1!=null)
        {
            temp2=temp1.next;
            temp1.next=temp;
            temp=temp1;
            temp1=temp2;
        }
        return temp;
    }

    static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }


    static void detectAndRemoveLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (slow != fast) {
            return;
        }
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=head.next.next;
        System.out.println(detectLoop(head));
        detectAndRemoveLoop(head);
        traverse(head);

    }
}
