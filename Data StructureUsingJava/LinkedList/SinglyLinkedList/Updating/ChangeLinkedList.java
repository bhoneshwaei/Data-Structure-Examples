//[Naive Approach] Change Linked List to Array - O(n) Time and O(n) Space

package SinglyLinkedList.Updating;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int x) {
        data = x;
        next = null;
    }
}

public class ChangeLinkedList {

    // Function to count nodes
    static int countNodes(Node head) {

        int count = 0;
        Node curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

    // Function to convert linked list to list
    static void linkedListToList(Node head, List<Integer> list) {

        Node curr = head;

        for (int i = 0; i < list.size(); i++) {
            list.set(i, curr.data);
            curr = curr.next;
        }
    }

    // Function to convert list back to linked list
    static void listToLinkedList(List<Integer> list, Node head) {

        Node curr = head;

        for (int i = 0; i < list.size(); i++) {
            curr.data = list.get(i);
            curr = curr.next;
        }
    }

    // Function to modify list
    static void modifyList(List<Integer> list) {

        for (int i = 0; i < list.size() / 2; i++) {

            int x = list.get(i);

            list.set(i, list.get(list.size() - i - 1) - x);

            list.set(list.size() - i - 1, x);
        }
    }

    // Function to modify linked list
    static Node modifyTheList(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        // Count nodes
        int n = countNodes(head);

        // Create list
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(0);
        }

        // Convert linked list to list
        linkedListToList(head, list);

        // Modify list
        modifyList(list);

        // Convert list back to linked list
        listToLinkedList(list, head);

        return head;
    }

    // Function to print linked list
    static void printList(Node node) {

        Node curr = node;

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
        // 10 -> 4 -> 5 -> 3 -> 6
        Node head = new Node(10);

        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(6);

        System.out.print("Original Linked List: ");
        printList(head);

        // Modify linked list
        head = modifyTheList(head);

        System.out.print("Modified Linked List: ");
        printList(head);
    }
}
