package stack;

public class MyStack<T>  {

    private Object[] array;
    private int top;
    private int size;


    public MyStack(int size) {
        this.size = size;
        array = new Object[size];
        top = -1;
    }

    public Boolean isEmpty(){
        return top == -1;
    }
    public Boolean isFull(){
        return top >= size;
    }

    public void pop() throws Exception{
        if (isEmpty() == true)
            throw new Exception("stack is empty");
        top--;
    }
    public int getTop(){
        return top;
    }

    public Object peek(){
        return array[top];
    }

    public void push(int i){
        top++;
        array[top] = i;
    }

    public static void main(String[] args)  throws Exception {
        MyStack myStack = new MyStack(10);
        myStack.push(5);
        myStack.push(6);
        myStack.push(44);
        myStack.pop();
        System.out.println(myStack.peek());

    }
}
