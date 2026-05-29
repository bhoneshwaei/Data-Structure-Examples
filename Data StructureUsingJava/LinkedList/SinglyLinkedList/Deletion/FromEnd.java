//Deletion at end (Removal of last node) in a Linked List

package SinglyLinkedList.Deletion;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class FromEnd {

    // Function to delete last node
    static Node removeLastNode(Node head) {

        // If list is empty
        if (head == null) {
            return null;
        }

        // If only one node exists
        if (head.next == null) {
            return null;
        }

        // Find second last node
        Node secondLast = head;

        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        // Remove last node
        secondLast.next = null;

        return head;
    }

    // Function to print linked list
    static void printList(Node head) {

        while (head != null) {

            System.out.print(head.data + " -> ");

            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create singly linked list
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original Linked List: ");
        printList(head);

        // Delete last node
        head = removeLastNode(head);

        System.out.print("After Deletion From End: ");
        printList(head);
    }
}
