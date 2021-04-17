
package linkedlist;


class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        this.next=null;
    }
}

class LinkedList {
    static Node head;
    Node tail;
    int size;

    public void addLast(int data){
        Node temp = new Node(data);
        temp.data = data;
        temp.next=null;
        if(size==0){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

    public int size(){
        return size;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public void removeFirst(){
        if(size==0){
            System.out.println("List is Empty");
        }
        else{
            if(size==1){
                head=tail=null;
                size=0;
            }
            else{
                head=head.next;
                size--;
            }
        }
    }

    public int  getFirst(){
        if(size==0){
            System.out.println("List is Empty");
            return -1;
        }
       else{
           return head.data;
        }
    }

    public int  getLast(){
        if(size==0){
            System.out.println("List is Empty");
            return -1;
        }
        else{
            return tail.data;
        }
    }

    public int getAt(int index){
            if(size==0){
                System.out.println("List is Empty");
                return -1;
            }
            else if(index<0 || index>=size){
                System.out.println("Invalid index");
                return -1;
            }else{
                Node temp = head;
                for(int i=0;i<index;i++){
                    temp=temp.next;
                }
                return temp.data;
            }
    }

    public void addFirst(int data){
        Node temp = new Node(data);
        temp.data=data;
        temp.next=head;
        head=temp;
        if(size==0){
            tail=temp;
        }
        size++;
    }

    public void addAt(int data, int index){
        if(index<0 || index>=size){
            System.out.println("Invalid index");
        }
        else{
            if(index==0){
                addFirst(data);
            }
            else{
                Node temp = head;
                Node l = new Node(data);
                l.data=data;
                for(int i=0;i<index-1;i++){
                    temp=temp.next;
                }
                l.next=temp.next;
                temp.next=l;
                size++;
            }
        }
    }

    public void removeLast(){
        if(size==0){
            System.out.println("List is empty!!");
        }
        else{
            if(size==1){
                head=tail=null;
                size=0;
            }else{
                Node temp = head;
                for(int i=0;i<size-2;i++){
                    temp=temp.next;
                }
                temp.next=null;
                tail=temp;
                size--;
            }
        }
    }

    public static void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public int getMiddle(){
        Node s = head;
        Node f = head;
        while (f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s.data;
    }

    public static void remveDuplicates() {
       /* LinkedList s = new LinkedList();

        //since sorted
        while (this.size()>0){
            int firs=this.getFirst();
            this.removeFirst();
            if(s.size()==0 || s.tail.data!=firs){
                s.addLast(firs);
            }

        }
        return s;*/
        Node curr = head;

        /* Traverse list till the last node */
        while (curr != null) {
            Node temp = curr;
            /*Compare current node with the next node and
            keep on deleting them until it matches the current
            node data */
            while(temp!=null && temp.data==curr.data) {
                temp = temp.next;
            }
            /*Set current node next to the next different
            element denoted by temp*/
            curr.next = temp;
            curr = curr.next;
        }
    }


    public static void oddEvenList(){
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node currentNode = head;

        while(currentNode != null) {
            int element = currentNode.data;

            if(element % 2 == 0) {

                if(evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }

            } else {

                if(oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }
            }
            // Move head pointer one step in forward direction
            currentNode = currentNode.next;
        }


        if(oddStart == null || evenStart == null) {
            return;
        }

        evenEnd.next = oddStart;
        oddEnd.next = null;
        head=evenStart;
    }

    static Node kreverse(Node head, int k)
    {
        if(head==null){
            return null;
        }
        Node curr = head;
        Node prev= null;
        Node next=null;
        int count=0;
        while (count<k && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if (next != null)
            head.next = kreverse(next,k);
        return prev;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addLast(3);
        l.addLast(4);
        l.addLast(7);
        l.addLast(8);
        l.oddEvenList();
        //l.display();
        //  System.out.println("MIDDLE"+l.getMiddle());
        // l.display();
        //
       // l.remveDuplicates();
       // l.display();
        l.head=l.kreverse(l.head,3);
        l.display();

    }
}
