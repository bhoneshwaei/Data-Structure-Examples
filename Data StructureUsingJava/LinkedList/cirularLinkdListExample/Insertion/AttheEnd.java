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

public class AttheEnd {

    // Function to insert node at end
    static Node insertEnd(Node tail, int value) {

        // Create new node
        Node newNode = new Node(value);

        // If list is empty
        if (tail == null) {

            tail = newNode;
            newNode.next = newNode;
        } else {

            // Insert new node after tail
            newNode.next = tail.next;
            tail.next = newNode;

            // Update tail
            tail = newNode;
        }

        return tail;
    }

    // Function to print circular linked list
    static void printList(Node last) {

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

        // Insert nodes at end
        last = insertEnd(last, 5);
        last = insertEnd(last, 6);

        System.out.print("After Insertion At End: ");
        printList(last);
    }
}
