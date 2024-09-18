
public class Queue {
    Node head;

    // add entry to the queue
    public void enqueue(Object val){
        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
        } else {
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // remove first entry from the queue
    public Object dequeue(){
        if (head == null){
            System.out.println("Queue is empty !");
            return null;
        } else {
            Object firstIn =  head.val;
            head = head.next;
            return firstIn;
        }
    }

    // see the first input of a queue
    public Object peek(){
        if (head == null){
            System.out.println("Queue is empty !");
            return null;
        }
        return head.val;
    }

    public int size(){
        int size = 1;
        if (head == null){
            System.out.println("Queue is empty");
            return 0;
        } else {
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
                size += 1;
            }
        }
        return size;
    }

}