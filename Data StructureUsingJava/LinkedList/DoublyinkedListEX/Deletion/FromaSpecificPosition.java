package DoublyinkedListEX.Deletion;

class Node {
    int data;
    Node prev;
    Node next;

    // Constructor
    Node(int d) {
        data = d;
        prev = next = null;
    }
}

public class FromaSpecificPosition {

    // Function to delete node at specific position
    public static Node delPos(Node head, int x) {

        // If list is empty
        if (head == null) {
            return head;
        }

        Node curr = head;

        // Traverse to the given position
        for (int i = 1; curr != null && i < x; i++) {
            curr = curr.next;
        }

        // If position is invalid
        if (curr == null) {
            System.out.println("Position out of range");
            return head;
        }

        // Update previous node link
        if (curr.prev != null) {
            curr.prev.next = curr.next;
        }

        // Update next node link
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }

        // If head node is deleted
        if (head == curr) {
            head = curr.next;
        }

        return head;
    }

    // Function to print doubly linked list
    static void printList(Node head) {

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

        System.out.print("Original List: ");
        printList(head);

        // Delete node at position 2
        head = delPos(head, 2);

        System.out.print("After Deletion at Position 2: ");
        printList(head);
    }
}
