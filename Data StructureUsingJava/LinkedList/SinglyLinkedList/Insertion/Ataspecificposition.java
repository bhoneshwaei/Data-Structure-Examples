//Insert a node at a specific position in a linked list

package SinglyLinkedList.Insertion;

class Node {
    int val;
    Node next;

    // Constructor
    Node(int x) {
        val = x;
        next = null;
    }
}

public class Ataspecificposition {

    // Function to insert node at specific position
    static Node insertPos(Node head, int pos, int val) {

        // Invalid position
        if (pos < 1) {
            return head;
        }

        // Insert at beginning
        if (pos == 1) {

            Node newNode = new Node(val);

            newNode.next = head;

            return newNode;
        }

        Node curr = head;

        // Traverse to position
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // Position out of range
        if (curr == null) {
            return head;
        }

        // Create new node
        Node newNode = new Node(val);

        // Insert node
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    // Function to print linked list
    static void printList(Node head) {

        Node curr = head;

        while (curr != null) {

            System.out.print(curr.val);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Create singly linked list
        // 1 -> 2 -> 4
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(4);

        System.out.print("Original Linked List: ");
        printList(head);

        // Insert node at position 3
        int val = 3;
        int pos = 3;

        head = insertPos(head, pos, val);

        System.out.print("After Insertion At Position 3: ");
        printList(head);
    }
}
