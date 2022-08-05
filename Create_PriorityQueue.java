//Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.

import java.util.PriorityQueue;
public class Create_PriorityQueue 
{
    public static void main(String args[])
    {
        PriorityQueue<String> pqueue = new PriorityQueue<String>();
        pqueue.add("Red");
        pqueue.add("Black");
        pqueue.add("Yellow");
        pqueue.add("Green");
        
        System.out.println("Element of the Priority Queue : " + pqueue);
        
    }
}
