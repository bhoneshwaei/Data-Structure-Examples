package cirularLinkdListExample.Insertion;

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
    static Node insertAtBeginning(Node last, int key) {

        // Create new node
        Node newNode = new Node(key);

        // If list is empty
        if (last == null) {
            newNode.next = newNode;
            return newNode;
        }

        // Insert new node after last
        newNode.next = last.next;
        last.next = newNode;

        return last;
    }

    // Function to print circular linked list
    static void printList(Node last) {

        if (last == null) {
            return;
        }

        Node head = last.next;
        Node temp = head;

        do {
            System.out.print(temp.data);

            temp = temp.next;

            if (temp != head) {
                System.out.print(" -> ");
            }

        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {

        // Create circular linked list
        // 2 -> 3 -> 4 -> back to 2
        Node first = new Node(2);
        first.next = new Node(3);
        first.next.next = new Node(4);

        Node last = first.next.next;

        // Make circular connection
        last.next = first;

        System.out.print("Original Circular Linked List: ");
        printList(last);

        // Insert 5 at beginning
        last = insertAtBeginning(last, 5);

        System.out.print("After Insertion At Beginning: ");
        printList(last);
    }
}
