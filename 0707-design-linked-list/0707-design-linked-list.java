class MyLinkedList {

    public class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
        }
    }
    ListNode head;

    public MyLinkedList() {
        head=null;
    }
    
    public int get(int index) {
        
        if (head == null || index < 0) {
            return -1;
        }

        ListNode temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;

            if (temp == null) {
                return -1;
            }
        }

        return temp.data;
    }
    
    public void addAtHead(int val) {
        ListNode newnode = new ListNode(val);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
    
    public void addAtTail(int val) {
        ListNode newnode = new ListNode(val);
        if(head==null){
            head=newnode;
            return;
        }
        ListNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0) return;

        ListNode newnode = new ListNode(val);

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }
        temp = head;

        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        ListNode temp2=temp.next;
        temp.next=newnode;
        newnode.next=temp2;
    }
    
    public void deleteAtIndex(int index) {
        if(head==null || index<0) return;

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if(index>=size) return; 
        if(index==0){
            head=head.next;
            return;
        }

        temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        

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