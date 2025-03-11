import java.util.*;
public class StackAndQueue {
    public static void main(String[] args) {

        // STACK
        Stack <String> stack1 = new Stack<String>();

        stack1.push("apple");
        stack1.push("banana");
        stack1.push("orange");

        System.out.println(stack1);

        System.out.println(stack1.peek()); // What will it print out?

        stack1.pop();


        System.out.println(stack1);  // What will it print out now?


        // QUEUE

        Queue<String> queue1 = new LinkedList<String>();

        queue1.add("kiwi");
        queue1.add("dragon fruit");
        queue1.add("lime");

        System.out.println(queue1);  // What will it print out?

        System.out.println(queue1.peek());  // What will it print out?
        System.out.println(queue1.poll());
        System.out.println(queue1.element());

        queue1.remove();  // Removes the first element (FIFO)
        System.out.println(queue1);  // What will it print out now?

    }
}
