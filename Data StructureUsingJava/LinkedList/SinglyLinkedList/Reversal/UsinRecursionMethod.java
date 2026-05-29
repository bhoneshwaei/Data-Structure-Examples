//[Alternate Approach 1] Using Recursion Method- O(n) Time and O(n) Space

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

public class UsinRecursionMethod {

    // Function to reverse linked list using recursion
    static Node reverseList(Node head) {

        // Base condition
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse remaining list
        Node rest = reverseList(head.next);

        // Put current node at end
        head.next.next = head;

        // Make current node next null
        head.next = null;

        return rest;
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