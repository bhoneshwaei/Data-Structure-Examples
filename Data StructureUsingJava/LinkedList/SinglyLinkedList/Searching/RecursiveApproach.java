
//[Approach 2] Recursive Approach - O(n) Time and O(n) Space

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

public class RecursiveApproach {

    // Function to search key using recursion
    static boolean searchKey(Node head, int key) {

        // Base case
        if (head == null) {
            return false;
        }

        // If key found
        if (head.data == key) {
            return true;
        }

        // Recursive call for next node
        return searchKey(head.next, key);
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
        int key = 14;

        // Search key
        if (searchKey(head, key)) {
            System.out.println("Key Found");
        } else {
            System.out.println("Key Not Found");
        }
    }
}
