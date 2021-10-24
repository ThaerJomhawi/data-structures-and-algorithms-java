package stack.and.queue;

public class Stack <T> {
    Node top;

    public Stack() {
        this.top = null;

    }

    public void push(T value) {
        Node newNode = new Node(value);
        if (!empty()) {
            newNode.next = top;
        }
        top = newNode;
    }


    public boolean empty() {
        if (top == null ) {
            return true;
        }

        return false;
    }

    public Object pop () throws Exception{
        if(empty()){
            throw new Exception("Is empty") ;
        }

        Node temp = top;
        top = top.next;
        temp.next=null;
        return temp.value;
    }

    public String peek() throws Exception {
        if (empty()) {
            throw new Exception("Is empty");
        } else {
            return (String) top.getValue();
        }
    }

    @Override
    public String toString(){
        Node temp = this.top;
        if (temp==null){
            return "Is empty";
        }
        String str = "";
        while (temp!= null) {
            str = str + "{"+temp.value+"}->";
            temp =temp.next;
        }
        str = str + "NUll";
        return str;
    }
}