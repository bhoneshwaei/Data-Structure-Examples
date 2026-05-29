
//[Naive Approach] Reverse the 2nd Half Twice - O(n) Time and O(1) Space

package SinglyLinkedList.Updating;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int x) {
        data = x;
        next = null;
    }
}

public class ReverseThe2ndHalfTwice {

    // Function to reverse linked list
    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;
        Node next = null;

        // Reverse linked list
        while (curr != null) {

            next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Function to modify linked list
    static Node modifyTheList(Node head) {

        // If list has only one node
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        // Find middle node
        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // Second half starts after middle
        Node reversedList = mid.next;

        // Split list into two halves
        mid.next = null;

        // Reverse second half
        reversedList = reverse(reversedList);

        Node curr1 = head;
        Node curr2 = reversedList;

        // Modify values
        while (curr2 != null) {

            int x = curr1.data;

            curr1.data = curr2.data - x;

            curr2.data = x;

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        // Reverse second half again
        mid.next = reverse(reversedList);

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
