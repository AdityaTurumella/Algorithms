package linkedlist;

public class QueueUsingLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;
    Node tail;
    int size=0;

    public void enqueue(int data){
        Node temp = new Node(data);
        if(size==0){
            head=tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

    public void dequeue(){
        if(size==0){
            System.out.println("EMPTY");
        }
        if(size==1){
            head=tail=null;
            size=0;
        }else{
            head=head.next;
            size--;
        }

    }

    void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        //addLast removeFirst
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.enqueue(5);
        q.dequeue();
        q.enqueue(1);
        q.enqueue(4);
        q.enqueue(6);
        q.dequeue();
        q.display();
    }


}
