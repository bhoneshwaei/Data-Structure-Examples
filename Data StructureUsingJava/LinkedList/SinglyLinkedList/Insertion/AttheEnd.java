//Insert Node at the End of a Linked List
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

public class AttheEnd {

    // Function to insert node at end
    static Node insertAtEnd(Node head, int x) {

        // Create new node
        Node newNode = new Node(x);

        // If list is empty
        if (head == null) {
            return newNode;
        }

        // Traverse to last node
        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        // Insert new node at end
        last.next = newNode;

        return head;
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

        // Insert node at end
        head = insertAtEnd(head, 6);

        System.out.print("After Insertion At End: ");
        printList(head);
    }
}