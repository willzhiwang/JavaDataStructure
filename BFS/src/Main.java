import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


    }

    /*
    无需分层遍历的宽度优先搜索
    When you do not need Tree Level Order Traversal
    */
    // T 指代任何你希望存储的类型
    public void noTraversal_BFS ()
    {
        Queue<T> queue = new LinkedList<>();
        Set<T> set = new HashSet<>();

        set.add(start);
        queue.offer(start);
        while (!queue.isEmpty()) {
            T head = queue.poll();
            for (T neighbor : head.neighbors) {
                if (!set.contains(neighbor)) {
                    set.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }
    /*
    无需分层遍历的宽度优先搜索
    When you need Tree Level Order Traversal
    */
    // T 指代任何你希望存储的类型
    public void noTraversal_BFS ()
    {
        Queue<T> queue = new LinkedList<>();
        Set<T> set = new HashSet<>();

        set.add(start);
        queue.offer(start);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                T head = queue.poll();
                for (T neighbor : head.neighbors) {
                    if (!set.contains(neighbor)) {
                        set.add(neighbor);
                        queue.offer(neighbor);
                    }
                }
            }
        }
    }
}
