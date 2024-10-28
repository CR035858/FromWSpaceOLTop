package com.gl.dsa3;
import java.util.*;

 
// Java program to implement all functions
// used in Doubly Linked List
 
// Node for Doubly Linked List
class Node{
    int key;
    Node prev;
    Node next;
    Node(){
        prev = null;
        next = null;
    }
}
public class DoublyLinkedListNew {
	
	static Node head = null;
    static Node first = null;
    static Node tail = null;
    static Node temp = null;
    static int i = 0;
    // Function to add a Node in the
    // Doubly Linked List
    static void addNode(int k)
    {
     
        // Allocating memory
        // to the Node ptr
        Node ptr = new Node();
     
        // Assign Key to value k
        ptr.key = k;
     
        // Next and prev pointer to NULL
        ptr.next = null;
        ptr.prev = null;
     
        // If Linked List is empty
        if (head == null) {
            head = ptr;
            first = head;
            tail = head;
        }
     
        // Else insert at the end of the
        // Linked List
        else {
            temp = ptr;
            first.next = temp;
            temp.prev = first;
            first = temp;
            tail = temp;
        }
     
        // Increment for number of Nodes
        // in the Doubly Linked List
        i++;
    }
     
    // Function to traverse the Doubly
    // Linked List
    static void traverseDLL()
    {
        // Nodes points towards head Node
        Node ptr = head;
     
        // While pointer is not NULL,
        // traverse and print the Node
        while (ptr != null) {
     
            // Print key of the Node
            System.out.print( ptr.key+" ");
            ptr = ptr.next;
        }
        System.out.println();
    }
     
    // Function to insert a Node at the
    // beginning of the linked list
    static void insertAtBeginning(int k)
    {
     
        // Allocating memory
        // to the Node ptr
        Node ptr = new Node();
     
        // Assign Key to value k
        ptr.key = k;
     
        // Next and prev pointer to NULL
        ptr.next = null;
        ptr.prev = null;
     
        // If head is NULL
        if (head == null) {
            first = ptr;
            first = head;
            tail = head;
        }
     
        // Else insert at beginning and
        // change the head to current Node
        else {
            temp = ptr;
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        i++;
    }
 
    // Function to insert Node at end
    static void insertAtEnd(int k)
    {
     
        // Allocating memory
        // to the Node ptr
        Node ptr= new Node();
     
        // Assign Key to value k
        ptr.key = k;
     
        // Next and prev pointer to NULL
        ptr.next = null;
        ptr.prev = null;
     
        // If head is NULL
        if (head == null) {
            first = ptr;
            first = head;
            tail = head;
        }
     
        // Else insert at the end
        else {
            temp = ptr;
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
        i++;
    }
     
    // Function to insert Node at any
    // position pos
    static void insertAtPos(int k, int pos)
    {
     
        // For Invalid Position
        if (pos < 1 || pos > i + 1) {
            System.out.println("Please enter a valid position");
        }
     
        // If position is at the front,
        // then call insertatbegin()
        else if (pos == 1) {
        	insertAtBeginning(k);
        }
     
        // Position is at length of Linked
        // list + 1, then insert at the end
        else if (pos == i + 1) {
        	insertAtEnd(k);
        }
     
        // Else traverse till position pos
        // and insert the Node
        else {
            Node src = head;
     
            // Move head pointer to pos
            while (pos--!=0) {
                src = src.next;
            }
     
            // Allocate memory to new Node
            Node da, ba;
            Node ptr = new Node();
            ptr.next = null;
            ptr.prev = null;
            ptr.key = k;
     
            // Change the previous and next
            // pointer of the Nodes inserted
            // with previous and next Node
            ba = src;
            da = (src.prev);
            ptr.next = (ba);
            ptr.prev = (da);
            da.next = ptr;
            ba.prev = ptr;
            i++;
        }
    }
     
    // Function to delete Node at the
    // beginning of the list
    static void deleteAtBeginnning()
    {
        // Move head to next and
        // decrease length by 1
        head = head.next;
        i--;
    }
     
    // Function to delete at the end
    // of the list
    static void deleteAtEnd()
    {
        // Mode tail to the prev and
        // decrease length by 1
        tail = tail.prev;
        tail.next = null;
        i--;
    }
     
    // Function to delete the Node at
    // a given position pos
    static void deleteAtPos(int pos)
    {
     
        // If invalid position
        if (pos < 1 || pos > i + 1) {
            System.out.println("Please enter a valid position");
        }
     
        // If position is 1, then
        // call delatbegin()
        else if (pos == 1) {
        	deleteAtBeginnning();
        }
     
        // If position is at the end, then
        // call deletAtEnd()
        else if (pos == i) {
        	deleteAtEnd();
        }
     
        // Else traverse till pos, and
        // delete the Node at pos
        else {
            // Src Node to find which
            // Node to be deleted
            Node src = head;
            pos--;
     
            // Traverse Node till pos
            while (pos--!=0) {
                src = src.next;
            }
     
            // previous and after Node
            // of the src Node
            Node pre, aft;
            pre = (src.prev);
            aft = (src.next);
     
            // Change the next and prev
            // pointer of pre and aft Node
            pre.next = (aft);
            aft.prev = (pre);
     
            // Decrease the length of the
            // Linked List
            i--;
        }
    }
    
    public static void main(String[] args)
    {
    	// Adding node to the linked List
    	addNode(2);
    	addNode(4);
    	addNode(9);
    	addNode(1);
    	addNode(21);
    	addNode(22);
     
        // To print the linked List
        System.out.print("Linked List: ");
        traverseDLL();
        System.out.println();
       
        // To insert node at the beginning
        insertAtBeginning(1);
        System.out.print("Linked List after inserting 1 at beginning: ");
        traverseDLL();
       
        // To insert at the end
        insertAtEnd(0);
        System.out.print("Linked List after inserting 0 at end: ");
        traverseDLL();
       
        // To insert Node with
        // value 44 after 3rd Node
        insertAtPos(44, 3);
        System.out.print("Linked List after inserting 44 after 3rd Node: ");
        traverseDLL();
        System.out.println();
       
        // To delete node at the beginning
        deleteAtBeginnning();
        System.out.print("Linked List after deleting node at beginning: ");
        traverseDLL();
       
        // To delete at the end
        deleteAtEnd();
        System.out.print("Linked List after deleting node at end: ");
        traverseDLL();
       
        // To delete Node at position 5
        System.out.print("Linked List after deleting node at position 5: ");
        deleteAtPos(5);
        traverseDLL();
    
    }

}
