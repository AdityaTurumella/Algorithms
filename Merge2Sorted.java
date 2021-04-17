package linkedlist;

class Merge2Sorted{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head = null;
    Node tail = null;
    int size=0;
    void add(int data){
        Node temp=new Node(data);
        if(size==0){
            head=tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
            tail.next=null;
        }
        size++;
    }
    void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static Node merge2SortedLists(Node p1, Node p2){
        Node head = new Node(0);
        Node p = head;
        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if(p2 != null) {
            p.next = p2;
        }
        return head.next;
    }


    void mergeSort2Lists(Node a, Node b){

    }
    public static void main(String[] args) {
        Merge2Sorted l1 = new Merge2Sorted();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(44);
        l1.display();
        Merge2Sorted l2 = new Merge2Sorted();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        l2.add(7);
        l2.add(67);
        l2.add(67);
        l2.display();
        Node t = merge2SortedLists(l1.head, l2.head);
        while (t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}

