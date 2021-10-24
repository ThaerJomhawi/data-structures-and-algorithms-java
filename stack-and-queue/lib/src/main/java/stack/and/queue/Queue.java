package stack.and.queue;

class Queue<T> {
    Node head;
    Node tail;
    int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size =0;

    }



    public void enqueue(T value) throws Exception {
        Node newNode = new Node(value);
        size++;
        if (empty()) {
            head = newNode;
        } else {

            tail.next = newNode;

        }
        tail = newNode;

    }

    public String dequeue() throws Exception {
        size--;
        Node temp = head;
        if (empty()) {
            throw new Exception("empty");
        }
        head = head.next;
        temp.next = null;
        return (String) temp.getValue();


    }
    public String peek() throws Exception {
        if (empty()) {
            throw new Exception("empty");
        } else {
            return (String) tail.getValue();
        }
    }

    @Override
    public String toString(){
        Node pointer = this.head;
        if (pointer==null){
            return "empty";
        }
        String str = "";
        while (pointer!= null) {
            str = str + "{"+pointer.value+"}->";
            pointer =pointer.next;
        }
        str = str + "NUll";
        return str;
    }
    public boolean empty() {
        if (head == null || tail == null) {
            return true;
        }

        return false;
    }

}