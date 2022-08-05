import java.util.*;
import java.util.Iterator;
public class Iterate_elements 
{
    public static void main(String args[])
    {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Government");
        h_set.add("Polytechnic");
        h_set.add("Poona");
        Iterator<String> p = h_set.iterator();
        while(p.hasNext())
        {
            System.out.println(p.next());
        }
    }
}
