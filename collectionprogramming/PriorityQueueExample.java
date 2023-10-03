package collectionprogramming;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Enqueue elements with priorities
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        
        System.out.println("Enqueue elements with priorities :" +priorityQueue);
       
        // Dequeue elements in ascending order of priority
        int highestPriority = priorityQueue.poll(); // Removes and returns 10
        int nextPriority = priorityQueue.poll(); // Removes and returns 20
        
        // Peek at the element with the highest priority
        int peekedElement = priorityQueue.peek(); // Returns 30 (still in the queue)
        System.out.println(" Peek at the element with the highest priority :" +peekedElement);
        // Check if the priority queue is empty
        boolean isEmpty = priorityQueue.isEmpty(); // false

        // Get the size of the priority queue
        int size = priorityQueue.size(); // 1
    }
}
