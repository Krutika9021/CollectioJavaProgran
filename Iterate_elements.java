import java.util.PriorityQueue;
public class Iterate_elements
{
    public static void main(String args[])
    {
        PriorityQueue<String> pqueue = new  PriorityQueue<String>();
        pqueue.add("Government");
        pqueue.add("Polytectic");
        pqueue.add("Poona");
        
        System.out.println("Elements of Priority Queue : ");
        for(String element : pqueue)
        {
            System.out.println(element);
        }
    }
}
