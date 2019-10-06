import java.util.ArrayList;
import java.util.List;

/**
 * Implement stack with ArrayList
 * Only support int
 */
public class Stack_list {
    List<Integer> array = new ArrayList<>();
    //add element
    public void push(int x){
        array.add(x);
    }
    // delete the last element
    public void pop (){
        if (!isEmpty()){
            array.remove(array.size()-1);
        }
    }
    // return the last element of the stack
    public int top() {
        return array.get(array.size()-1);
    }
    //check stack is empty
    public boolean isEmpty(){
        return array.size() == 0;
    }
}
