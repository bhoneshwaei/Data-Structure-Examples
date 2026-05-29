package DoublyinkedListEX.ForwardraversalofDoublyLinkedList;

public class RecursiveApproachforForwardTraversal {

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

    // Recursive function for forward traversal
    static void forwardTraversal(Node head) {

        // Base condition
        if (head == null) {
            return;
        }

        // Print current node data
        System.out.print(head.data + " ");

        // Recursive call for next node
        forwardTraversal(head.next);
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

        System.out.print("Forward Traversal: ");

        // Call recursive traversal
        forwardTraversal(head);
    }
}