package DoublyinkedListEX.Traversal.BackwardTraversalofDoublyLinkedList;

public class IterativeApproachforBackwardTraversal {

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

    // Function for backward traversal
    static void backwardTraversal(Node tail) {

        // Start from tail node
        Node curr = tail;

        // Traverse backward
        while (curr != null) {

            // Print current node data
            System.out.print(curr.data + " ");

            // Move to previous node
            curr = curr.prev;
        }
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

        // Call backward traversal
        backwardTraversal(third);
    }
}
