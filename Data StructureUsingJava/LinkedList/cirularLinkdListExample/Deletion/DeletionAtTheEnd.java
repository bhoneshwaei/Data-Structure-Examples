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

public class DeletionAtTheEnd {

    // Function to delete last node
    public static Node deleteLastNode(Node last) {

        // If list is empty
        if (last == null) {
            return null;
        }

        Node head = last.next;

        // If only one node exists
        if (head == last) {
            last = null;
            return last;
        }

        // Find second last node
        Node curr = head;

        while (curr.next != last) {
            curr = curr.next;
        }

        // Update second last node next to head
        curr.next = head;

        // Update last pointer
        last = curr;

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

        // Delete last node
        last = deleteLastNode(last);

        System.out.print("After Deletion At End: ");
        printList(last);
    }
}