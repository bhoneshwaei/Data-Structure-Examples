package SinglyLinkedList.Traversal.TraversalOfSinglyLinkedList;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

public class IterativeApproach {

    // Function to traverse and print singly linked list
    public static void traverseList(Node head) {

        while (head != null) {

            System.out.print(head.data);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Create singly linked list
        // 10 -> 20 -> 30 -> 40
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Singly Linked List: ");

        // Traverse list
        traverseList(head);
    }
}