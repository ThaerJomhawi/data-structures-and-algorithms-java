package stack.and.queue;

public class Node<T> {

    public Node next;
    public T value;

    public Node(T value) {
        this.value = value;
        this.next = null;


    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
