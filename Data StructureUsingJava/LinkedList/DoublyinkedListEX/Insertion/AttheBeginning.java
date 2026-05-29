//Given a Doubly Linked List, insert a new node at the beginning/start/front of the linked list.

package DoublyinkedListEX.Insertion;

public class AttheBeginning {

    // Node class
    static class Node {

        int data;
        Node next;
        Node prev;

        // Constructor
        Node(int newData) {
            data = newData;
            next = null;
            prev = null;
        }
    }

    // Function to insert a node at the beginning
    static Node insertAtFront(Node head, int newData) {

        // Create new node
        Node newNode = new Node(newData);

        // Make next of new node as head
        newNode.next = head;

        // Change prev of head node
        if (head != null) {
            head.prev = newNode;
        }

        // Return new node as new head
        return newNode;
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
        // 2 <-> 3 <-> 4

        Node head = new Node(2);

        head.next = new Node(3);
        head.next.prev = head;

        head.next.next = new Node(4);
        head.next.next.prev = head.next;

        // Insert node at beginning
        int data = 1;

        head = insertAtFront(head, data);

        // Print updated list
        printList(head);
    }
}
