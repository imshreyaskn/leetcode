// Last updated: 5/25/2026, 4:29:08 PM
class MyLinkedList {


    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
        this.head = new Node(0);
        this.size = 0;
        
    }
    
    public int get(int index) {

        if(index < 0 || index>= size) return -1;

        Node curr = head.next;
        while(index>0){
            curr = curr.next;
            index--;
        }

        return curr.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {

        if(index < 0 || index>size) return;

        Node prev = head;
        while(index>0){
            prev = prev.next;
            index--;
        }
        Node newNode = new Node(val);
        newNode.next = prev.next ; 
        prev.next = newNode;

        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        Node prev = head;
        while(index>0){
            prev = prev.next;
            index--;
        }
        prev.next = prev.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */