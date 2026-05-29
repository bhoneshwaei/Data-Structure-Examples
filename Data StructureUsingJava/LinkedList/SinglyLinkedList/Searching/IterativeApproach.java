//IterativeApproach
//[Approach 1] Iterative Approach - O(n) Time and O(1) Space

package SinglyLinkedList.Searching;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int x) {
        data = x;
        next = null;
    }
}

public class IterativeApproach {

    // Function to search key in linked list
    static boolean searchKey(Node head, int key) {

        // Start from head node
        Node curr = head;

        // Traverse linked list
        while (curr != null) {

            // Check if key found
            if (curr.data == key) {
                return true;
            }

            // Move to next node
            curr = curr.next;
        }

        // Key not found
        return false;
    }

    public static void main(String[] args) {

        // Create singly linked list
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Key to search
        int key = 5;

        // Check key present or not
        if (searchKey(head, key)) {
            System.out.println("Key Found");
        } else {
            System.out.println("Key Not Found");
        }
    }
}
