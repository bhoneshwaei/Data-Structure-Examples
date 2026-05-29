//Deletion at end (Removal of last node) in a Doubly Linked List

package DoublyinkedListEX.Deletion;

class Node {
    int data;
    Node prev;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class FromEnd {

    // Function to delete last node
    public static Node delLast(Node head) {

        // If list is empty
        if (head == null) {
            return null;
        }

        // If only one node exists
        if (head.next == null) {
            return null;
        }

        // Traverse to last node
        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        // Remove last node
        curr.prev.next = null;

        return head;
    }

    // Function to print doubly linked list
    public static void printList(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);

            if (curr.next != null) {
                System.out.print(" <-> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Create doubly linked list
        // 1 <-> 2 <-> 3
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.prev = head;

        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        System.out.print("Original Linked List: ");
        printList(head);

        // Delete last node
        head = delLast(head);

        System.out.print("After Deletion at End: ");
        printList(head);
    }
}
