//Write a Java program to create a reverse order view of the elements contained in a given tree set.


import java.util.TreeSet;
import java.util.Iterator;
public class Reverse_order 
{
    public static void main(String args[])
    {
        TreeSet<String> t_set = new TreeSet<String>();
        t_set.add("krutika");
        t_set.add("Manisha");
        t_set.add("Gauri");
        
        System.out.println("Original TreeSet : " + t_set);
        Iterator it = t_set.descendingIterator();
        
        System.out.println("Elements in Reverse order : ");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }  
}
