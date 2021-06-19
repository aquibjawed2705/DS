package tree.bst;

import tree.Node;

public class BstTree {

    static boolean searchInBstIterative(Node root, int data) {
        while (root != null) {
            if (root.key == data) {
                return true;
            } else if (root.key < data) {
                root = root.right;
            } else if (root.key > data) {
                root = root.left;
            }
        }
        return false;
    }

    static boolean searchInBSTRecursive(Node root, int data) {
        if (root == null)
            return false;
        else if (root.key == data)
            return true;
        else if (root.key < data)
            return searchInBSTRecursive(root.right, data);
        else
            return searchInBSTRecursive(root.left, data);
    }

    static void traverseInOrder(Node root) {
        if (root != null) {
            traverseInOrder(root.left);
            System.out.print(root.key + " ");
            traverseInOrder(root.right);
        }

    }

    static Node insertInBstIterative(Node root, int data) {
        if (root == null) return new Node(data);
        Node temp = null;
        Node temp1 = root;
        while (root != null) {
            temp = root;
            if (root.key == data) {
                return root;
            } else if (root.key < data) {
                root = root.right;
            } else if (root.key > data) {
                root = root.left;
            }
        }

        if (data > temp.key) {
            temp.right = new Node(data);
        } else {
            temp.left = new Node(data);
        }
        return temp1;
    }

    static Node insertInBstRecursive(Node root, int data) {
        if (root == null) return new Node(data);
        if (root.key < data) {
            root.right = insertInBstRecursive(root.right, data);
        } else if (root.key > data) {
            root.left = insertInBstRecursive(root.left, data);
        }
        return root;
    }

    static Node deleteInBst(Node root, int data) {
        if (root == null) return root;
        if (root.key < data) {
            root.right = deleteInBst(root.right, data);
        } else if (root.key > data) {
            root.left = deleteInBst(root.left, data);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                Node successor = getSuccessor(root);
                root.key = successor.key;
                root.right = deleteInBst(root.right, successor.key);
            }
        }
        return root;
    }

    private static Node getSuccessor(Node root) {
        Node temp = root.right;
        while (temp != null && temp.left != null)
            temp = temp.left;
        return temp;
    }

    static boolean isBstUsingRange(Node root, int min, int max) {
        if(root==null) return true;
        return (root.key>min && root.key<max && isBstUsingRange(root.left,min,root.key) &&
                isBstUsingRange(root.right,root.key,max));
    }
    static int prev=Integer.MIN_VALUE;
    static boolean isBstUsingInOrderTraversal(Node root) {
       if(root==null) return true;
       if(isBstUsingInOrderTraversal(root.left)==false) return false;
       if(root.key<=prev) return false;
       prev=root.key;
        return isBstUsingInOrderTraversal(root.right) ;
    }



    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.right.left = new Node(18);
        root.right.right = new Node(80);
        root.right.left.left = new Node(100);
        System.out.println(isBstUsingRange(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        System.out.println(isBstUsingInOrderTraversal(root));
        /*traverseInOrder(root);
        System.out.println(searchInBstIterative(root, 14));
        System.out.println(searchInBSTRecursive(root, 15));
        root = insertInBstIterative(root, 17);
        System.out.println("Iterative...");
        traverseInOrder(root);
        root = insertInBstRecursive(root, 19);
        System.out.println("Recusive...");
        traverseInOrder(root);
        root = deleteInBst(root, 19);
        root=deleteInBst(root,15);
        System.out.println("\nDelete...");
        traverseInOrder(root);*/

    }
}
