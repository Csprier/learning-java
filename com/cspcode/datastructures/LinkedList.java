package com.cspcode.datastructures;

/*
* Singly LinkedList:
 Node {
  int data = 1;
  object next = Node {
                  int data = 2,
                  object next = Node {
                                  int data = 3;
                                  object next = Node {
                                                  int data = 4;
                                                  object next = null;
                                                 };
                                 }
                 }
 }
*/

public class LinkedList {

  Node head;
  Node tail;
  int length;

  // LinkedList Constructor
  public LinkedList() {
    head = null;
    tail = null;
    length = 0;
  }

  // Node Class
  static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // INSERT
  public void insert(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      tail = newNode;
      length++;
    } else {
      tail.next = newNode;
      tail = newNode;
      length++;
    }
  }

  // PRINT LIST
  public void printList() {
    Node current = head;

    if (head == null) {
      System.out.println("The list is empty!");
      return;
    }
    System.out.println("Nodes of the Singly Linked List:");
    while (current != null) {
      System.out.println(current.data + " ");
      current = current.next;
    }
    System.out.println("Length: " + length);
  }

  // Main
  public static void main(String[] args) {
    LinkedList sList = new LinkedList();

    sList.insert(1);
    sList.insert(2);
    sList.insert(3);
    sList.insert(4);

    sList.printList();
  }
}
