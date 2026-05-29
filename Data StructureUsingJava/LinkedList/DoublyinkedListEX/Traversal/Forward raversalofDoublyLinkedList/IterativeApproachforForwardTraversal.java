package DoublyinkedListEX.ForwardraversalofDoublyLinkedList;

public class IterativeApproachforForwardTraversal {

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

    // Function for forward traversal
    static void forwardTraversal(Node head) {

        Node curr = head;

        while (curr != null) {

            // Print current node data
            System.out.print(curr.data + " ");

            // Move to next node
            curr = curr.next;
        }

        System.out.println();
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

        // Call traversal function
        forwardTraversal(head);
    }
}
