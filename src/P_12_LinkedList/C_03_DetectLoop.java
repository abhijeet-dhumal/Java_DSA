package P_12_LinkedList;

public class C_03_DetectLoop {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    //Floyd's cycle finding algorithm
    /*
    slow +1
    fast +2

    _________________________
               |     d      |
               |____________|

    0 moves --> 0 distance between slow and fast
    1 moves --> 1 distance
    2 moves --> 2
    3 moves --> 3
    ...
     */
    public static boolean detectCyclicLoopLL(){
        Node slow = head;
        Node fast = head;
        System.out.println(slow.data+"|"+slow+"->");
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            System.out.println(slow.data+"|"+slow+"->");
            if(slow==fast){
                System.out.println("\nslowNode : "+slow.data+"|"+slow);
                System.out.println("fastNode : "+fast.data+"|"+fast);
                System.out.println("slowNode==FastNode");
                return true; // cycle exists
            }
        }
        System.out.println();
        return false; //cycle does not exists
    }

    //how to remove cyclic loop present in LL
    /* Mathematically it is always true that :
        when in a loop slow==fast (cycle exists),
        then if we assign slow with head and
        move slow and fast node by 1 to next nodes,
        the node at which slow==fast,
        that is the lastNode

    1) find last node:
        i) detect cycle (slow==fast)
        ii) slow=head
        iii) initialize prev=null
        iii) while(slow!=fast){ slow+=1; fast+=1; prev=fast; }

    2) lastNode.next=null ==> prev.next=null;

     */

    public static void removeCyclicLoopLL() {
        Node slow = head;
        Node fast = head;

        boolean isCycle = false;
        while (fast != null || fast.next == null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast==slow) { //loop exists
                isCycle = true;
                System.out.println("Loop exists");
                break;
            }
        }
        if (isCycle == false) {
            System.out.println("Loop doesn't exists");
            return;
        }
            //find meeting point
            slow = head;
            Node prev = null; //last node
            while (slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            //found last node as stored in prev
            prev.next = null; // RemovedCycle : Now, lastNode cyclic connection is broken
        System.out.println("removed");
    }
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next= temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        // 1 -> 2 --> 3 --> 2
        System.out.println(detectCyclicLoopLL());
        /* ==>
        1|P_11_LinkedList.C_03_DetectLoop$Node@4dd8dc3->
        2|P_11_LinkedList.C_03_DetectLoop$Node@6d03e736->
        3|P_11_LinkedList.C_03_DetectLoop$Node@568db2f2->

        slowNode : 3|P_11_LinkedList.C_03_DetectLoop$Node@568db2f2
        fastNode : 3|P_11_LinkedList.C_03_DetectLoop$Node@568db2f2
        slowNode==FastNode
        true

         */

        removeCyclicLoopLL(); //>> removed
        System.out.println(detectCyclicLoopLL());
        /* >>
        false
         */
    }
}
