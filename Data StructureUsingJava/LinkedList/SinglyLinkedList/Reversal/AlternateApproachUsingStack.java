
//[Approach] Using Iterative Method - O(n) Time and O(1) Space
package SinglyLinkedList.Reversal;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class AlternateApproachUsingStack {

    // Function to reverse singly linked list
    static Node reverseList(Node head) {

        Node curr = head;
        Node prev = null;
        Node next;

        // Traverse and reverse list
        while (curr != null) {

            // Store next node
            next = curr.next;

            // Reverse current node link
            curr.next = prev;

            // Move pointers forward
            prev = curr;
            curr = next;
        }

        // New head
        return prev;
    }

    // Function to print linked list
    static void printList(Node node) {

        while (node != null) {

            System.out.print(node.data);

            if (node.next != null) {
                System.out.print(" -> ");
            }

            node = node.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Create singly linked list
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original Linked List: ");
        printList(head);

        // Reverse linked list
        head = reverseList(head);

        System.out.print("Reversed Linked List: ");
        printList(head);
    }
}