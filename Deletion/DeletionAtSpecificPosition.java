package cirularLinkdListExample.Deletion;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int value) {
        data = value;
        next = null;
    }
}

public class DeletionAtSpecificPosition {

    // Function to delete specific node
    public static Node deleteSpecificNode(Node last, int key) {

        // If list is empty
        if (last == null) {
            return null;
        }

        Node curr = last.next;
        Node prev = last;

        // If only one node exists
        if (curr == last && curr.data == key) {
            last = null;
            return last;
        }

        // If first node is to be deleted
        if (curr.data == key) {
            last.next = curr.next;
            return last;
        }

        // Traverse list to find node
        while (curr != last && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        // If node found
        if (curr.data == key) {

            // Remove node
            prev.next = curr.next;

            // If deleting last node
            if (curr == last) {
                last = prev;
            }
        }

        return last;
    }

    // Function to print circular linked list
    public static void printList(Node last) {

        if (last == null) {
            return;
        }

        Node head = last.next;

        while (true) {
            System.out.print(head.data);

            head = head.next;

            if (head == last.next) {
                break;
            }

            System.out.print(" -> ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Create circular linked list
        // 2 -> 3 -> 4 -> back to 2
        Node first = new Node(2);
        first.next = new Node(3);
        first.next.next = new Node(4);

        Node last = first.next.next;

        // Make circular connection
        last.next = first;

        System.out.print("Original Circular Linked List: ");
        printList(last);

        // Delete node with value 3
        int key = 3;

        last = deleteSpecificNode(last, key);

        System.out.print("After Deletion of Node 3: ");
        printList(last);
    }
}
