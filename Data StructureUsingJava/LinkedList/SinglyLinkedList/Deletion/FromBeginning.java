//Deletion at beginning (Removal of first node) in a Linked List
package SinglyLinkedList.Deletion;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int x) {
        data = x;
        next = null;
    }
}

public class FromBeginning {

    // Function to delete head node
    static Node deleteHead(Node head) {

        // If list is empty
        if (head == null) {
            return null;
        }

        // Store current head
        Node temp = head;

        // Move head to next node
        head = head.next;

        // Delete old head
        temp = null;

        return head;
    }

    // Function to print linked list
    static void printList(Node curr) {

        while (curr != null) {

            System.out.print(curr.data);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Create singly linked list
        // 8 -> 2 -> 3 -> 1 -> 7
        Node head = new Node(8);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(7);

        System.out.print("Original Linked List: ");
        printList(head);

        // Delete first node
        head = deleteHead(head);

        System.out.print("After Deletion From Beginning: ");
        printList(head);
    }
}
