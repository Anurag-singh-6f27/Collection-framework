package Stacks_And_Queues;

public class Custom_Stack {
    protected int[] data;
    private static final int DEFAULTSIZE = 10;
    private int ptr = -1;

    public Custom_Stack() {
        this(DEFAULTSIZE);
    }

    public Custom_Stack(int size) {
        this.data = new int[size];
    }

    public void push(int num) throws Exception{
        if (isFull()) {
            throw new Exception("StackOverflowException");
        }
        ptr++;
        data[ptr] = num;
    }
    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("StackUnderflowException");
        }
        int x=data[ptr];
        ptr--;
        return x;
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("StackUnderflowException");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
}
