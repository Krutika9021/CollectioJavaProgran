import java.util.PriorityQueue;
public class insert_element
{
    public static void main(String args[])
    {
        PriorityQueue<String> pqueue = new PriorityQueue<String>();
        pqueue.add("Volvo");
        pqueue.add("Range Rover");
        pqueue.add("Ferrari");
        pqueue.add("BMW");
        
        System.out.println("Original priority Queue : " + pqueue);
        pqueue.offer("Lamborghinni");
        System.out.println("After insertion in priority Queue : " + pqueue);
    }
    
}
