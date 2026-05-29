package DoublyinkedListEX;

public  class Example {
    // Node class for doubly linked list
    static class Node {
        int data;
        Node prev;
        Node next;

        // constructor to initialize a new node with data
        Node(int new_data) {
            this.data = new_data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Create the first node (head of the list)
        Node head = new Node(10);

        // Link the second node
        head.next = new Node(20);
        head.next.prev = head; // Set previous pointer of second node

        // Link the third node
        head.next.next = new Node(30);
        head.next.next.prev = head.next; // Set previous pointer of third node

        // Link the fourth node
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next; // Set previous pointer of fourth node

        // printing linked list in forward direction
        System.out.println("Doubly Linked List in forward direction:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // printing linked list in backward direction
        System.out.println("\nDoubly Linked List in backward direction:");
        temp = head;
        while (temp.next != null) {
            temp = temp.next; // Move to the last node
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev; // Move backwards through the list
        }
    }
    
}






IterativeApproachforForwardTraversal
 RecursiveApproachforForwardTraversal


  * BackwardTraversalofDoublyLinkedList

 IterativeApproachforBackwardTraversal
 RecursiveApproachforBackwardTraversal








Traversal : Display Linked List Elements

Insertion : AttheBeginning, AttheEnd
 and        Atthespecificposition
Deletion : FromtheBeginning,
         FromEnd                         and
  FromaSpecificPosition










