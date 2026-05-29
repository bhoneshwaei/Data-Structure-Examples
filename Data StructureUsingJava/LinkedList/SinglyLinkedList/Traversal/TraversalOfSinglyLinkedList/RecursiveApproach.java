package SinglyLinkedList.Traversal.TraversalOfSinglyLinkedList;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class RecursiveApproach {

    // Function to traverse and print singly linked list
    static void traverseList(Node head) {

        // Base condition
        if (head == null) {
            System.out.println();
            return;
        }

        // Print current node
        System.out.print(head.data);

        // Print arrow if next node exists
        if (head.next != null) {
            System.out.print(" -> ");
        }

        // Recursive call for next node
        traverseList(head.next);
    }

    public static void main(String[] args) {

        // Create singly linked list
        // 10 -> 20 -> 30 -> 40
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Singly Linked List: ");

        // Traverse list recursively
        traverseList(head);
    }
}
