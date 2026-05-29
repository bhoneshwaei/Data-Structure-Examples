/*A circular linked list is a data structure where the last node points back to the first node, forming a closed loop.

Structure: All nodes are connected in a circle, enabling continuous traversal without encountering NULL.
Difference from Regular Linked List: In a regular linked list, the last node points to NULL, whereas in a circular linked list, it points to the first node.
Uses: Ideal for tasks like scheduling and managing playlists, where smooth and repeated. */

//1 .Circular Singly Linked List


//2 .Circular Doubly Linked List:

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

Insertion : AttheBeginning, AttheEnd and AtaSpecificPosition

Deletion : Removalfromdifferentpositions
