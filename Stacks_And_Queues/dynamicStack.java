package Stacks_And_Queues;

public class dynamicStack extends Custom_Stack {
    public dynamicStack() {
        super();
    }

    public dynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(int num) throws Exception {
        if(this.isFull()){
            int []temp=new int[2* data.length];
            System.arraycopy(data, 0, temp, 0, data.length);
            data=temp;
        }
        super.push(num);
    }
}

