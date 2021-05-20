package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(45);
        root.right.right = new Node(50);
        System.out.println("DFS-----Start");
        System.out.println("In-Order Traversal");
        inorderTraversal(root);
        System.out.println("\nPre-Order Traversal");
        preorderTraversal(root);
        System.out.println("\nPost-Order Traversal");
        postorderTraversal(root);
        System.out.println("\nDFS-----End");
        System.out.println("Height of binary tree is " + binaryTreeHeight(root));
        System.out.println("Print node at a distance K");
        printKDist(root, 1);
        System.out.println("\nBFS-----Start");
        System.out.println("Level Order Traversal ");
        levelOrderTraversal(root, binaryTreeHeight(root));
        System.out.println("\nLevel Order Traversal using queue");
        levelOrderTraversalUsingQueue(root);
        System.out.println("\nLevel Order Traversal using queue in line");
        levelOrderTraversalUsingQueueInLine(root);
        System.out.println("\nLevel Order Traversal using queue in line M2");
        levelOrderTraversalUsingQueueInLineM2(root);
        System.out.println("BFS-----End");
        System.out.println("Size of binary tree:" + getSizeOfBinaryTree(root));

    }

    static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.key + " ");
            inorderTraversal(root.right);
        }
    }

    static void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            inorderTraversal(root.left);
            inorderTraversal(root.right);
        }
    }

    static void postorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            inorderTraversal(root.right);
            System.out.print(root.key + " ");
        }
    }

    static int binaryTreeHeight(Node root) {
        if (root == null) return 0;
        else return Math.max(binaryTreeHeight(root.left), binaryTreeHeight(root.right)) + 1;
    }

    static void printKDist(Node root, int k) {
        if (root == null) return;
        if (k == 0) System.out.print(root.key + " ");
        else {
            printKDist(root.left, k - 1);
            printKDist(root.right, k - 1);
        }
    }

    static void levelOrderTraversal(Node root, int height) {
        if (root == null) return;
        System.out.print(root.key + " ");
        for (int i = 0; i < height; i++) {
            printKDist(root.left, i);
            printKDist(root.right, i);
        }

    }

    static void levelOrderTraversalUsingQueue(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            Node curr = queue.poll();
            System.out.print(curr.key + " ");
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);

        }

    }

    static void levelOrderTraversalUsingQueueInLine(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        queue.add(null);
        while (queue.size() > 1) {
            Node curr = queue.poll();
            if (curr == null) {
                System.out.println();
                queue.add(null);
                continue;
            }
            System.out.print(curr.key + " ");
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }

    }


    static void levelOrderTraversalUsingQueueInLineM2(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            int count=queue.size();
            for (int i = 0; i < count; i++) {
                Node curr = queue.poll();
                System.out.print(curr.key + " ");
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
            System.out.println();
        }
    }

    static int getSizeOfBinaryTree(Node root) {
        if (root == null) return 0;
        return 1 + getSizeOfBinaryTree(root.left) + getSizeOfBinaryTree(root.right);
    }


}
