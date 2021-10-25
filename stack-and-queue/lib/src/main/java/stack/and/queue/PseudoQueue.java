package stack.and.queue;

public class PseudoQueue<T> {

    public Stack<T> stack1 = new Stack<T>();
    public Stack<T> stack2 = new Stack<>();

    public void enqueue(T value) {
        stack1.push(value);
    }

    public T dequeue() throws Exception {
        T valueToReturn = null;
        if (stack2.empty()){
            while (!stack1.empty()){
                try{
                    stack2.push((T) stack1.pop());
                }catch(Exception e){

                }

            }
            valueToReturn = (T) stack2.pop();
            while (!stack2.empty()){
                stack1.push((T) stack2.pop());
            }
        }
        return valueToReturn;
    }
}