package LL;

public class LLDemo {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at start
    static Node addStart(Node head, int data) {
        Node n1 = new Node(data);
        n1.next = head;
        return n1;
    }

    // Insert at end
    static Node addEnd(Node head, int data) {
        Node n1 = new Node(data);

        if (head == null) return n1;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;

        return head;
    }

    // Insert at specific position (0-based index)
    static Node addAtPosition(Node head, int data, int pos) {
        if (pos == 0) {
            return addStart(head, data);
        }

        Node n1 = new Node(data);
        Node temp = head;

        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return head;
        }

        n1.next = temp.next;
        temp.next = n1;

        return head;
    }

    // Delete at start
    static Node deleteStart(Node head) {
        if (head == null) return null;
        return head.next;
    }

    // Delete at end
    static Node deleteEnd(Node head) {
        if (head == null || head.next == null) return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }

    // Delete at specific position (0-based index)
    static Node deleteAtPosition(Node head, int pos) {
        if (head == null) return null;

        if (pos == 0) {
            return deleteStart(head);
        }

        Node temp = head;

        for (int i = 0; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid position");
            return head;
        }

        temp.next = temp.next.next;

        return head;
    }

    // Print Linked List
    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        printLL(head);

        head = addStart(head, 5);
        head = addEnd(head, 40);
        head = addAtPosition(head, 25, 3);

        printLL(head);

        head = deleteStart(head);
        head = deleteEnd(head);
        head = deleteAtPosition(head, 2);

        printLL(head);
    }
}