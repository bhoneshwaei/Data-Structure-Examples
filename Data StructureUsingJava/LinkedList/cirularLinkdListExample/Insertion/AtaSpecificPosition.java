package cirularLinkdListExample.Insertion;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int value) {
        data = value;
        next = null;
    }
}

public class AtaSpecificPosition {

    // Function to insert node at specific position
    public static Node insertAtPosition(Node last, int data, int pos) {

        // If list is empty
        if (last == null) {

            if (pos != 1) {
                System.out.println("Invalid Position!");
                return last;
            }

            // Create first node
            Node newNode = new Node(data);

            last = newNode;
            last.next = last;

            return last;
        }

        // Create new node
        Node newNode = new Node(data);

        // Start from head
        Node curr = last.next;

        // Insert at beginning
        if (pos == 1) {

            newNode.next = curr;
            last.next = newNode;

            return last;
        }

        // Traverse to position
        for (int i = 1; i < pos - 1; i++) {

            curr = curr.next;

            // Position out of range
            if (curr == last) {
                System.out.println("Invalid Position!");
                return last;
            }
        }

        // Insert node
        newNode.next = curr.next;
        curr.next = newNode;

        // If inserted at end
        if (curr == last) {
            last = newNode;
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
        first.next.next.next = first;

        Node last = first.next.next;

        System.out.print("Original Circular Linked List: ");
        printList(last);

        // Insert 5 at position 2
        int data = 5;
        int pos = 2;

        last = insertAtPosition(last, data, pos);

        System.out.print("After Insertion At Position 2: ");
        printList(last);
    }
}
