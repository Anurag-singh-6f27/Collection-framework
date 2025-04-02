package Dsa_Questions;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first=new Stack<>();
        second=new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int popped=second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return popped;
    }

    public int top() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked =second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack obj=new QueueUsingStack();
        obj.push(10);
        obj.push(11);
        obj.push(12);
        obj.push(13);
    int param_2 = obj.pop();
    int param_3 = obj.top();
     boolean param_4 = obj.empty();
        System.out.println(param_2+"\n"+param_3+"\n"+param_4+"\n");
    }
}
