package DoublyinkedListEX.Insertion;

class Node {
    int data;
    Node next, prev;

    Node(int newData) {
        data = newData;
        next = prev = null;
    }
}

public class AttheEnd {

    // Function to insert a node at the end
    public static Node insertEnd(Node head, int newData) {

        // Create new node
        Node newNode = new Node(newData);

        // If list is empty
        if (head == null) {
            head = newNode;
            return head;
        }

        // Traverse to the last node
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        // Connect last node with new node
        curr.next = newNode;
        newNode.prev = curr;

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

        // Insert 5 at the end
        head = insertEnd(head, 5);

        // Print list
        printList(head);
    }
}