package DoublyinkedListEX.Insertion;

class Node {
    int data;
    Node next, prev;

    Node(int new_data) {
        data = new_data;
        next = prev = null;
    }
}

public class Atthespecificposition {

    // Function to insert a new node at a specific position
    static Node insertAtPos(Node head, int pos, int new_data) {

        // Create a new node
        Node new_node = new Node(new_data);

        // Insert at beginning
        if (pos == 1) {
            new_node.next = head;

            // If list is not empty
            if (head != null) {
                head.prev = new_node;
            }

            head = new_node;
            return head;
        }

        Node curr = head;

        // Traverse to the node before insertion position
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // Position out of bounds
        if (curr == null) {
            System.out.println("Position out of range");
            return head;
        }

        // Link new node
        new_node.prev = curr;
        new_node.next = curr.next;

        // Update next node prev pointer
        if (curr.next != null) {
            curr.next.prev = new_node;
        }

        // Update current node next pointer
        curr.next = new_node;

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
        // 1 <-> 2 <-> 4
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.prev = head;

        head.next.next = new Node(4);
        head.next.next.prev = head.next;

        // Insert 3 at position 3
        int data = 3;
        int pos = 3;

        head = insertAtPos(head, pos, data);

        // Print list
        printList(head);
    }
}