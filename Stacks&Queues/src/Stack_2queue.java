import java.util.Queue;
import java.util.LinkedList;
/**
 * Implement Stack with two queues
 * use queue1 to save elements, use queue2 to assist queue
 */

public class Stack_2queue {
    public Queue<Integer> queue1 = new LinkedList<Integer>();
    public Queue<Integer> queue2 = new LinkedList<Integer>();
    //move elements form queue1 to queue2 except the last one
    public void moveItems(){
        while (queue1.size() !=  1){
            queue2.offer(queue1.poll());
        }
    }
    //Swap two queues
    public void swapQueues(){
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    // add from stack
    public void push (int x){
        queue1.offer(x);
    }
    // delete from stack
    public void pop(){
        moveItems();
        queue1.poll();
        swapQueues();
    }
    //get last element from stack
    public int top(){
        moveItems();
        int item = queue1.poll();
        swapQueues();
        queue1.offer(item);
        return item;
    }
    //check if stack is empty
    public boolean isEmpty(){
        return queue1.isEmpty();
    }
}
