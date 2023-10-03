package collectionprogramming;
import java.util.LinkedList;
import java.util.Queue;

public class LinearQueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> linearQueue = new LinkedList<>();

        // Enqueue (add) elements to the queue
        linearQueue.add("Apple");
        linearQueue.add("Banana");
        linearQueue.add("Cherry");
        
        System.out.println("linearQueue :" +linearQueue);
        // Dequeue (remove) elements from the front of the queue
        String firstElement = linearQueue.poll(); // Removes and returns "Apple"
        System.out.println("linearQueue after poll :" +linearQueue);

        // Peek at the front element without removing it
        String frontElement = linearQueue.peek(); // Returns "Banana" (still in the queue)
        System.out.println("Peek at the front element without removing it :" +linearQueue);

        // Check if the queue is empty
        boolean isEmpty = linearQueue.isEmpty(); // false

        // Get the size of the queue
        int size = linearQueue.size(); // 2
    }
}
