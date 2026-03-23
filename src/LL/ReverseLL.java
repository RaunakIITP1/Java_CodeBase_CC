package LL;

public class ReverseLL {

        // Node class
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // Print Linked List
        static void printList(Node head) {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Reverse Linked List
        static Node reverse(Node head) {
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node next = curr.next; // store next
                curr.next = prev;      // reverse link
                prev = curr;           // move prev
                curr = next;           // move curr
            }

            return prev;
        }

        public static void main(String[] args) {

            // Creating Linked List: 10 -> 20 -> 30 -> 40
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);

            System.out.println("Original List:");
            printList(head);

            // Reverse
            head = reverse(head);

            System.out.println("Reversed List:");
            printList(head);
        }
}
