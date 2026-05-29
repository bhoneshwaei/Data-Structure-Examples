package DoublyinkedListEX.Traversal.BackwardTraversalofDoublyLinkedList;

public class RecursiveApproachforBackwardTraversal {

    // Node class
    static class Node {

        int data;
        Node next;
        Node prev;

        // Constructor
        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    // Recursive function for backward traversal
    static void backwardTraversal(Node node) {

        // Base condition
        if (node == null) {
            return;
        }

        // Print current node data
        System.out.print(node.data + " ");

        // Recursive call for previous node
        backwardTraversal(node.prev);
    }

    public static void main(String[] args) {

        // Create nodes
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Connect nodes
        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        System.out.print("Backward Traversal: ");

        // Call recursive backward traversal
        backwardTraversal(third);

        System.out.println();
    }
}