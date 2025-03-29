public class Circular_queue {
    private int[] data;
    private static final int DEFAULTSIZE = 10;
    private int end = 0;
    protected int front=0;
    protected int size;
    public Circular_queue() {
        this(DEFAULTSIZE);
    }

    public Circular_queue(int size) {
        this.data= new int[size];
    }
    public void insert(int num) throws Exception {
        if (isFull()) {
            throw new Exception("queue is full");
        }
        data[end++] = num;
        end=end%data.length;
        size++;
    }
    public void remove() throws Exception {
        if(isEmpty()){
            throw new Exception("StackUnderflowException");
        }
        int x=data[front++];
        front=front%data.length;
        size--;
    }
    public int first()
    {
        return data[0];
    }
    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("StackUnderflowException");
        }
       int i=front;
       do {
           System.out.print(data[i] + " ");
           i++;
           i=i%data.length;
       }while(i!=end);
        System.out.println();

    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
}
