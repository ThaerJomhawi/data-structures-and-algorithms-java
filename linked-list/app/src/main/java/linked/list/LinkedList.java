package linked.list;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public void insert(T val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    boolean includes(T value){
        Node cur = head;
        while (cur.next != null){
            if(cur.val.equals(value)){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString(){
        Node cur = head;
        String result = "";
        while (cur != null){
            result += "{ " + cur.val + " } -> ";
            cur = cur.next;
        }
        result += "NULL";
        return  result;
    }

    public void append(T newVal)  {
        Node _tmp = new Node(newVal);
        if (head == null) {
            head = _tmp;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = _tmp;
        }
    }

    public void insertBefore(T value, T newVal) {
        Node _tmp = new Node(newVal);
        if (head == null) {
            head = _tmp;
        } else if (head.val == value) {
            insert(newVal);
        } else {
            Node cur = head;
            while (cur.next != null) {
                if (cur.next.val == value) {
                    _tmp.next = cur.next;
                    cur.next = _tmp;
                    break;
                }
                cur = cur.next;
            }
        }
    }

    public void insertAfter(T value, T newVal) {
        Node _tmp = new Node(newVal);
        if (head == null) {
            head = _tmp;
        } else {
            Node cur = head;
            while (cur != null) {
                if (cur.val == value) {
                    _tmp.next = cur.next;
                    cur.next = _tmp;
                }
                cur = cur.next;
            }
        }
    }
}