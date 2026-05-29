// Insert a Node at Front of a Linked List
package SinglyLinkedList.Insertion;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int x) {
        data = x;
        next = null;
    }
}

public class AttheBeginning {

    // Function to insert node at beginning
    static Node insertAtFront(Node head, int x) {

        // Create new node
        Node newNode = new Node(x);

        // Point new node to current head
        newNode.next = head;

        // Return new node as head
        return newNode;
    }

    // Function to print linked list
    static void printList(Node head) {

        Node curr = head;

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
        // 2 -> 3 -> 4 -> 5
        Node head = new Node(2);

        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.print("Original Linked List: ");
        printList(head);

        // Insert node at beginning
        int x = 1;

        head = insertAtFront(head, x);

        System.out.print("After Insertion At Beginning: ");
        printList(head);
    }
}
