package com.cspcode.datastructures;

import com.cspcode.utility.ObjectUtils;

/*
------------------------------------------------
  null <- [ 1 (Head) ] <--> [ 2 ] <--> [ 3 ] <--> [ 4 (Tail) ] -> null;
------------------------------------------------
(Head) Node { data: 1; next: Node { data 2 }; previous: null;             };
       Node { data: 2; next: Node { data 3 }; previous: Node { data: 1 }; };
       Node { data: 3; next: Node { data 4 }; previous: Node { data: 2 }; };
(Tail) Node { data: 4; next: null;            previous: Node { data: 3 }; }
*/

public class DoublyLinkedList {

  // Node Class
  static class Node {
    int data;
    Node previous;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  // Create the head and tail of the D.LinkedList
  Node head;

  // DLL Constructor
  DoublyLinkedList() {
    head = null;
  }

  // ===============================================================================================
  /* INSERT FIRST ---------------------------
   * @param int data
   */
  public void insertAtTheStart(int data) {
    Node newNode = new Node(data);

    newNode.next = head;
    newNode.previous = null;

    if(head != null) {
      head.previous = newNode;
    }

    head = newNode;
  }

  // ===============================================================================================
  /* INSERT LAST ---------------------------
   * @param int data
   */
  public void insertLast(int data) {
    Node newNode = new Node(data);

    // if the head does not exist, i.e. the list is empty, set the head to the newNode
    if (head == null) {
      head = newNode;
    }

    System.out.println("Inserting " + data + " at the end of the list!");
  }

  // ===============================================================================================
  /* INSERT AT ---------------------------
   * @param int data
   */
  public void insertAt(int data, int index) {
    Node newNode = new Node(data);
    int counter = 0;
    Node currentNode = head;
    Node previousNode = head;

    // while the counter is not the index and the currentNode is not the last in the list
    // increment the counter by 1
    // previousNode becomes the new currentNode in the iteration
    // currentNode becomes the old currentNode's next value
    while((counter != index) && (currentNode.next != null)) {
      counter++;
      previousNode = currentNode;
      currentNode = currentNode.next;
    }
    previousNode.next = newNode;
  }

  // ===============================================================================================
  // PRINT LIST
  public void printList() {
    Node current = head;

    if (head == null) {
      System.out.println("The list is empty!");
      return;
    }

    System.out.println("--------------------------------");
    System.out.println("Nodes of the Doubly Linked List:");
    while (current != null) {
      System.out.println(current.data + " ");
      current = current.next;
    }
  }

  // MAIN
  public static void main(String[] args) {
    DoublyLinkedList dLList = new DoublyLinkedList();

    dLList.insertAtTheStart(1);
    dLList.insertAtTheStart(0);
//    dLList.insertLast(2);
//    dLList.insertLast(3);
//    dLList.insertLast(4);
//    dLList.insertLast(5);
//    dLList.insertAt(1, 1);

    dLList.printList();
//    System.out.println(ObjectUtils.deserializeObjectToString(dLList));
  }
}
