package P_12_LinkedList;

/* LinkedList with 4 Nodes

    Head
    data|next -> data|next -> data|next -> data|next
                                            Tail
    'Next' is a reference variable which stores next node reference

    class Node{
        int data;
        Node next;
        public Node(int data){  #constructor
            this.data=data;
            this.next=null;
        }
    }
 */
public class C_01_LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static int size;

    //Methods
    //In previous codes we used static keyword to declare function parallel to main function
    // but here it is not needed
    //main function by default call static methods
    // but in LL now we are referencing these as class methods
    // so thats why static keyword declare not needed
    public void traverseForward(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        //first  element is ll.head which will not change
        //initalize tmp node with head value which will traverse through LL
        Node currentnode=head;
        // till currentNode.next is not null
        while(currentnode!=null){
            System.out.print(currentnode.data+"->");
            //assign next node reference to currentNode so that it will traverse further
            currentnode=currentnode.next;

        }
        System.out.println("null");
    }

    public void AddFirst(int data)
    {
        //step1 : new Node create
        Node newNode = new Node(data);
        size++;
        // is some elements are already present
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node dataNode=new Node(data);
        Node currentNode=head;
        size++;
        // is some elements are already present
        //traverse till last element
        while(currentNode!=null){
            if(currentNode.next==null){
                currentNode.next=dataNode;
                return;
            }
            currentNode=currentNode.next;
        }
    }

    public void AddAtIndex(int data,int index){
        /*
        head i=0    i=1             i=2
        data/next   data\next ->  data/next
         |               |^
        newNode=data\next

        if i want to add node at index 1
        newNode.next should refer to node at index 1
        and node at i=0 should refer to newNode
         */
        Node dataNode=new Node(data);
        Node tmp=head; //currentNode
        if(index==0){
            AddFirst(data);
            return;
        }
        size++; // here size should be incremented after base case for 0
        // because in addFirst also we are incrementing size
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        int i=0;
        while(tmp!=null){
            if(i+1==index){
                dataNode.next=tmp.next;
                tmp.next=dataNode;
                return;
            }
            i++;
            tmp=tmp.next;
        }
    }

    public int sizeLL(){
        Node currentNode=head;
        int i=0;
        while(currentNode!=null){
            i++;
            currentNode=currentNode.next;
        }
        return i;
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("LL is empty");
        }
        Node tmp;
        tmp=head.next;
        head.next=null;
        head=tmp;
    }

    public void removeLast(){
        Node currentNode=head;
        while(currentNode!=null){
            if(currentNode.next.next==null){
                currentNode.next=null;
                tail=currentNode;
            }
            currentNode=currentNode.next;
        }
    }

    public int helperRecSearch(int key, Node head){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helperRecSearch(key,head.next);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){

        return helperRecSearch(key,head);
    }

    /*
            head            next
   null    1(data|next)   2(data|next)   3(data|next)   4(data|next)
   prev      curr                                                tail

    //initialization
    prev=null
    tail=1(data|next)
    curr=tail

    while(curr!=null){
        next=curr.next
        curr.next=prev
    }
     */
    public void reverseLL(){

        // to traverse till currentNode==2ndLastNode
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void deleteNthFromEnd(int n){
        Node currentNode=head;
        int i=0;
        int sizeLL=sizeLL();
        while(currentNode!=null){
            if(i+1==sizeLL-n){
                currentNode.next=currentNode.next.next;
                return;
            }
            i+=1;
            currentNode=currentNode.next;
        }
    }
    public static void main(String[] args) {
        C_01_LinkedList ll = new C_01_LinkedList();
        ll.traverseForward();
        //>> LL is empty

        //ll.head = new Node(1);
        ll.AddFirst(1);
        ll.traverseForward();
        //ll.head.next = new Node(2);
        ll.addLast(2);
        ll.traverseForward();
        System.out.println(ll); //>> P_11_LinkedList.C_01_LinkedList@65ab7765
        ll.traverseForward();
        //>>1->2->null

        System.out.println("----------------------------------");
        ll.AddFirst(4); // to add this data node at first place of LL
        System.out.print("Added 4 atFirst of LL : ");
        ll.traverseForward();
        //>> Added 4 atFirst of LL : 4->1->2->null

        System.out.println("----------------------------------");
        ll.addLast(5); // to add this data node at Last place of LL
        System.out.print("Added 5 atLast of LL : ");
        ll.traverseForward();
        //>> Added 5 atLast of LL : 4->1->2->5->null

        System.out.println("---------------------------------");
        ll.AddAtIndex(3,3);
        System.out.print("Added 3 atIndex 3 of LL : ");
        ll.traverseForward(); //>>Added 3 atIndex 3 of LL : 4->1->2->3->5->null

        System.out.println("---------------------------------");
        //System.out.println(ll.sizeLL()); //>>5
        System.out.println("SizeOf LL : "+size); //>> 5

        System.out.println("----------------------------------");
        ll.removeFirst();
        System.out.println("Removed first element");
        ll.traverseForward();//>>1->2->3->5->null

        System.out.println("----------------------------------");
        ll.removeLast();
        System.out.println("Removed last element");
        ll.traverseForward();//>>1->2->3->null
        System.out.println("SizeOf LL : "+size); //>> 3

        System.out.println("----------------------------------");
        //Recurssive search
        System.out.println(ll.recSearch(3));

        System.out.println("----------------------------------");
        //ReverseLL
        ll.reverseLL();
        ll.traverseForward();//>> 3->2->1->null

        //remove NthNode from last
        ll.AddAtIndex(3,3);
        ll.traverseForward();
        //>>3->2->1->3->null

        ll.deleteNthFromEnd(2);
        ll.traverseForward();
        //>> 3->2->3->null
    }
}

/*
LL is empty
1->null
1->2->null
P_11_LinkedList.C_01_LinkedList@214c265e
1->2->null
----------------------------------

Added 4 atFirst of LL : 4->1->2->null
----------------------------------

Added 5 atLast of LL : 4->1->2->5->null
----------------------------------

Added 3 atIndex 3 of LL : 4->1->2->3->5->null
----------------------------------

SizeOf LL : 5
----------------------------------
Removed first element
1->2->3->5->null
----------------------------------
Removed last element
1->2->3->null
SizeOf LL : 5
----------------------------------
2
----------------------------------
3->2->1->null
3->2->1->3->null
3->2->3->null

 */