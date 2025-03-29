public class Custom_queue {
    private int[] data;
    private static final int DEFAULTSIZE = 10;
    private int end = 0;

    public Custom_queue() {
        this(DEFAULTSIZE);
    }

    public Custom_queue(int size) {
        this.data= new int[size];
    }
    public void insert(int num) {
        if (isFull()) {
            return;
        }
        data[end++] = num;
    }
    public void remove() {
       int x=data[0];
        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
        }
        end--;
    }
    public int first()
    {
        return data[0];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public boolean isFull(){
        return end==data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
}
