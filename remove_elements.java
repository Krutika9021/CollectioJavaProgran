import java.util.PriorityQueue;
public class remove_elements 
{
    public static void main(String args[])
    {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Krutika");
        pq.add("Gauri");
        pq.add("Manisha");
        pq.add("Sakshi");
        
        System.out.println("Original Pritority Queue : " + pq);
        pq.clear();
        System.out.println("The new Pritority Queue : " + pq);
    }
}
