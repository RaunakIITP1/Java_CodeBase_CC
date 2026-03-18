package LL;

public class LLDemo {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    static void printLL(Node head){

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("null");
    }

//    count nodes

    static int countNode(Node head)
    {
        int count=0;

        Node temp= head;
        while(temp!=null){
            count++;
            temp= temp.next;
        }
        return count;
    }

    static void main(String[] args) {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);

        printLL(head);
        int totalCount=countNode(head);
        System.out.println(totalCount);
    }
}
