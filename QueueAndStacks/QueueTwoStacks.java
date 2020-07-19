package QueueAndStacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class QueueTwoStacks {

    private Deque<Integer> inStack = new ArrayDeque<>();
    private Deque<Integer> outStack = new ArrayDeque<>();

    public void enqueue(int item) {
        inStack.push(item);
    }

    public int dequeue() {
        if (outStack.isEmpty()) {

            // move items from inStack to outStack, reversing order
            while (!inStack.isEmpty()) {
                int newestInStackItem = inStack.pop();
                outStack.push(newestInStackItem);
            }

            // if outStack is still empty, raise an error
            if (outStack.isEmpty()) {
                throw new NoSuchElementException("Can't dequeue from empty queue!");
            }
        }
        return outStack.pop();
    }

    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4, 5 };
        QueueTwoStacks q = new QueueTwoStacks();

        // insert above keys
        for (int key : keys) {
            q.enqueue(key);
        }
        System.out.println("InStack Items After Enqueuing " + q.inStack);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("Outstack Items After Dequeuing " + q.outStack);
    }
}