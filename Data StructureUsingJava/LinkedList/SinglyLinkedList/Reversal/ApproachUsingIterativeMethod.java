//[Alternate Approach 2] Using Stack - O(n) Time and O(n) Space

package SinglyLinkedList.Reversal;

import java.util.Stack;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class ApproachUsingIterativeMethod {

    // Function to reverse linked list using stack
    static Node reverseList(Node head) {

        Stack<Node> stack = new Stack<>();
        Node temp = head;

        // Push all nodes into stack
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        // Make last node as new head
        if (!stack.isEmpty()) {

            head = stack.pop();
            temp = head;

            // Pop remaining nodes
            while (!stack.isEmpty()) {

                temp.next = stack.pop();

                temp = temp.next;
            }

            // Last node points to null
            temp.next = null;
        }

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

        // Reverse linked list
        head = reverseList(head);

        System.out.print("Reversed Linked List: ");
        printList(head);
    }
}

