
public class Stack {
    Node head;

    // add new entry to the stack
    public void push(Object val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        } else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // see the top of the stack
    public Object peek(){
        Object lastVal = null;

        if(head == null){
            System.out.println("Stack is empty !");
            return lastVal;
        } else {
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            lastVal = curr.val;
        }
        return lastVal;
    }

    // remove the top of the stack Last In First Out (LIFO)
    // remove the tail of the LinkedList
    public Object pop(){
        if (head == null){
            System.out.println("Stack is empty !");
            return null;
        }
        else if (head.next == null){
            Object lastVal = head.val;
            head = null;
            return lastVal;
        }
        else {
            Node curr = head;
            while(curr.next.next != null){
                curr = curr.next;
            }
            Object lastVal = curr.next.val;
            curr.next = null;
            return lastVal;
        }
    }

    // get the size of the stack
    public int size(){
        int size = 1;
        if(head == null){
            System.out.println("Stack is empty !");
            return size = 0;
        }else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
                size += 1;
            }
        }
        return size;
    }
}