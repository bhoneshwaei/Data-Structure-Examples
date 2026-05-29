//Deletion at beginning (Removal of first node) in a Doubly Linked List

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

public class FromtheBeginning {

    // Function to delete node from beginning
    public static Node delHead(Node head) {

        // If list is empty
        if (head == null) {
            return null;
        }

        // Move head to next node
        head = head.next;

        // Set prev of new head to null
        if (head != null) {
            head.prev = null;
        }

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

        // Delete first node
        head = delHead(head);

        System.out.print("After Deletion at Beginning: ");
        printList(head);
    }
}
