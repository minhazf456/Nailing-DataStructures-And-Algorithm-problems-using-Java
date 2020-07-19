package QueueAndStacks;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;

public class MaxElementInStack {

    //Declare two stacks
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> maxStack = new Stack<>();


    public void push(int data) {

        int max = data;

        if(!maxStack.isEmpty() && max < maxStack.peek()) {
            max = maxStack.peek();
        }

        stack.push(data);
        maxStack.push(max);
    }

    public void pop() {
        stack.pop();
        maxStack.pop();
    }

    public int getMax() {
        return maxStack.peek();
    }

    public static void main(String[] args) {

        MaxElementInStack maxElem = new MaxElementInStack();
        maxElem.push(4);
        maxElem.push(3);
        maxElem.push(9);
        maxElem.push(2);
        maxElem.push(8);

        System.out.println("Stack " + maxElem.stack);
        System.out.println("MaxSTack " + maxElem.maxStack);
        System.out.println(" Max Element " + maxElem.getMax());

        maxElem.pop();
        maxElem.pop();
        maxElem.pop();

        System.out.println(maxElem.stack);
        System.out.println(maxElem.maxStack);

        System.out.println(" After 3 pop operation " + maxElem.getMax());
    }
}