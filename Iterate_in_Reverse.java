//Write a Java program to iterate a linked list in reverse order.


import java.util.Iterator;
import java.util.LinkedList;
  
public class Iterate_in_Reverse 
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("java");
        linkedList.add("is");
        linkedList.add("simple");
  
        Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
    }
}
