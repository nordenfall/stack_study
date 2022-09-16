package StackClass;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyStack {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    public void push(int x){
        queue2 = queue1;
        queue1 = new LinkedList<>();
        queue1.add(x);
        for (int s : queue2){
            queue1.add(s);
        }
    }

    public int pop(){
        if (!queue1.isEmpty()){
            return queue1.poll();
        }
        else {
            return 0;
        }
    }

    public int top(){
        if (!queue1.isEmpty()){
            return queue1.peek();
        }
        else{
            return 0;
        }
    }

    public boolean empty(){
        return queue1.isEmpty();
    }
}
