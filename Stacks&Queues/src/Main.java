public class Main {
    public static void main (String[] args)
    {
        Stack stack = new Stack ();
        stack.push("abc");
        stack.push("def");
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println("----------");
        Queue queue = new Queue();
        queue.add("abc");
        queue.add("def");
        queue.remove();
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());

    }

}
