class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
}
class LinkedList{
    
    Node Head = null;
    Node Tail= null;
    int size = 0;
    void addAtEnd(int data){
    Node temp = new Node(data);
    if(Head==null){
        Head = temp;
    }
    else{
        Tail.next = temp;
    }
    Tail=temp;
    size++;
    }
    void addAtHead(int value){
        Node temp = new Node(value);
        if(Head==null){
            addAtEnd(value);
        }
        else{
            // Head = temp;
            temp.next = Head;
            Head = temp;
        }
        size++;
    }
    void addAtIdx(int idx,int value){
        Node t = new Node(value);
        if(idx==0){
            addAtHead(value);
            return;
        }
        else if (idx == size){
            addAtEnd(value);
            return;
        }

        Node temp = Head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }

        t.next=temp.next;
        temp.next= t;
        size++;
    }
    void delete(int idx){
        Node temp = Head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        if(idx==0){
            Head=temp.next;
        }
        else {
        temp.next = temp.next.next;
        }
        size--;
    }

    void display(){
        Node temp = Head ;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void getAt(int idx){
        if(idx>size-1){
            System.out.println();
            System.out.println("Not Exist Element at "+idx+" Index");
            System.out.println();
            System.out.println("Note : Till "+(size-1) +" Index Element Exist");
            System.out.println();
            return;
        }
        Node temp = Head;
        
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        System.out.println("Element At Index "+idx +" is "+temp.data);
    }


} 
public class implementation {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtEnd(5);
        ll.addAtEnd(7);
        ll.addAtEnd(13);
        ll.addAtEnd(8);
        ll.delete(2);
        ll.addAtIdx(ll.size, 4);
        ll.addAtIdx(0, 1);
        System.out.println("Size of LinkedList "+ll.size);
        ll.display();
        System.out.println("Tail of LinkedList : "+ll.Tail.data);
        System.out.println("Head of LinkedList : "+ll.Head.data);
        ll.getAt(ll.size);
        ll.getAt(0);
        System.out.println();
    }
}














class ab{
    int data;
    ab next;
    

    ab(int data){
        this.data=data;
    }
    static void display(ab Head){
        while(Head!=null){
            System.out.print(Head.data+" ");
            Head=Head.next;
        }
        System.out.println();
    }
    static void insertAtEnd(ab Head,int data){
        while(Head.next!=null){
            Head=Head.next;
        }
        ab dat = new ab(data);
        dat.data=data;
        Head.next = dat;
    }


    public static void main(String[] args){
        ab a = new ab(1);
        ab b = new ab(2);
        // Node c = new Node(3);
        // Node d = new Node(4);
        a.next=b;
        // b.next=c;
        // c.next=d;

        
        
        // System.out.println(d.next);
        // System.out.println(d.data);
        System.out.println(a.next);
        System.out.println(b);
        insertAtEnd(a, 7);
        display(a);
    } 
}