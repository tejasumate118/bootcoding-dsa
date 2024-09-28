class Node{
    Node next;
    Node prev;
    int val;
    public Node (int val){
        this.val=val;
        prev=null;
        next=null;
    }
    
}

class MyCircularDeque {
    Node head = new Node(-1);
    Node tail = new Node(-1);
    int size;
    int currSize;


    public MyCircularDeque(int k) {
        head.next=tail;
        tail.prev=head;
        size=k;
        currSize=0;
        
    }
    
    public boolean insertFront(int value) {
        if(currSize==size) return false;
        addNode(head,value);
        currSize++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(currSize==size) return false;
        addNode(tail.prev,value);
        currSize++;
        return true;
    }
    
    public boolean deleteFront() {
        if(currSize == 0 )return false;
        deleteNode(head.next);
        currSize--;
        return true;
        
    }
    
    public boolean deleteLast() {
        if(currSize == 0) return false;
        deleteNode(tail.prev);
        currSize--;
        return true;
    }
    
    public int getFront() {
        return currSize == 0? -1:head.next.val;
    }
    
    public int getRear() {
        return currSize == 0?-1:tail.prev.val;
    }
    
    public boolean isEmpty() {
        return currSize == 0 ;
    }
    
    public boolean isFull() {
        return currSize ==size ;
    }
    void addNode(Node node,int val){
        Node newNode = new Node(val);
        Node next = node.next;
        node.next=newNode;
        newNode.prev = node;
        newNode.next = next;
        next.prev = newNode;
    }
    void deleteNode(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */