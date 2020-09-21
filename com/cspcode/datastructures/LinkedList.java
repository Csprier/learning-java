package com.cspcode.datastructures;

public class LinkedList {
  Node head; // Head of the list

  /* Nodes for the list! */
  static class Node {
    int data; // data to be stored in the node
    Node next;

    // Constructor
    Node(int d) {
      data = d;
      next = null;
    }
  }


}
