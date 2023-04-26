package P_12_LinkedList;

public class C_02_CheckPalindromeLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head, tail;

    public Node middleNode() {
        Node slowNode = head;
        Node fastNode = head;
        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }

    public boolean isPallindrome() {
        if(head==null || head.next==null){
            return true;
        }
        //step1 : find mid node
        Node mid = middleNode();

        //step2 : reverse second half
        Node prev=null;
        Node curr = mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right= prev; //right half head (last node)
        Node left = head;

        //step3 : check left and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public void AddFirst(int data) {
        //step1 : new Node create
        Node newNode = new Node(data);
        // is some elements are already present
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node dataNode = new Node(data);
        Node currentNode = head;
        // is some elements are already present
        //traverse till last element
        while (currentNode != null) {
            if (currentNode.next == null) {
                currentNode.next = dataNode;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        C_02_CheckPalindromeLL ll = new C_02_CheckPalindromeLL();
        ll.AddFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(3);
        System.out.println(ll.isPallindrome());
    }
}
