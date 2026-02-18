package LinkedList;

public class CreateLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next =  null;
        }
    }

    public static void main(String[] args) {
        Node head= new Node(10);
        Node second= new Node(20);

        head.next= second;


        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");


    }
}
