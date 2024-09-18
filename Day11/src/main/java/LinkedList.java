
public class LinkedList {
    Node head;

    // add new value
    public void add(Object val){
        Node newNode = new Node(val);
        if(head == null){
            this.head = newNode;
        } else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public Object getFirst(){
        return head.val;
    }

    public Object getLast(){
        Node curr = head;
        Object lastVal = null;
        while(curr != null){
            lastVal = curr.val;
            curr = curr.next;
        }
        return lastVal;
    }

    // Override toString() method, so it can be printed
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node currNode = head;
        while (currNode != null) {
            sb.append(currNode.val);
            currNode = currNode.next;

            if(currNode != null){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}