package Algorithms;

import java.util.LinkedList;

public class SinglyLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    
    
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void printList() {
        Node current = head;
        System.out.println("Printing Singly Linked List:--------------->");
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Exploring Singly Linked List:--------------->");
    }
}