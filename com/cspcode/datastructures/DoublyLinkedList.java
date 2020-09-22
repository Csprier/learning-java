package com.cspcode.datastructures;


public class DoublyLinkedList {
  Node head;
  Node tail;

  // DoublyLinkedList constructor
  public DoublyLinkedList() {
    head = null;
    tail = null;
  }

  // Node Class
  static class Node {
    int data;
    DoublyLinkedList.Node next;
    DoublyLinkedList.Node previous;

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.previous = null;
    }
  }

  // INSERT FIRST
  public static void insertFirst(Node node) {

  }
}
