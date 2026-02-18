package LinkedList;

public class InsertLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next =  null;
        }
    }

    static void main(String[] args) {
        Node head= null;

//        insert at start

        Node n1= new Node(5);
        n1.next= head;
        head= n1;

        Node n2= new Node(10);
        n2.next= head;
        head= n2;


//        insert at end
        Node n3= new Node(30);
        Node temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next= n3;



        temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");




    }
}
