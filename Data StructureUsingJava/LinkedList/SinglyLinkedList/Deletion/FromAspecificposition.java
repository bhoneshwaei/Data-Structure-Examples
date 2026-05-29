//Delete Node by Position
package SinglyLinkedList.Deletion;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FromAspecificposition {

    // Function to delete node at specific position
    static Node deleteNode(Node head, int position) {

        Node temp = head;

        // If head node is deleted
        if (position == 1) {

            head = temp.next;

            return head;
        }

        // Traverse to node before delete position
        Node prev = null;

        for (int i = 1; i < position; i++) {

            prev = temp;
            temp = temp.next;
        }

        // Delete node
        prev.next = temp.next;

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
        // 1 -> 2 -> 3 -> 4
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original Linked List: ");
        printList(head);

        // Delete node at position 3
        int position = 3;

        head = deleteNode(head, position);

        System.out.print("After Deletion: ");
        printList(head);
    }
}