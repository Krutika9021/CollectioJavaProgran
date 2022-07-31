
import java.util.ArrayList;
import java.util.List;

public class retrieve_elements
{
    public static void main(String args[])throws Exception
    {
        List aList = new ArrayList();
        aList.add("Krutika");
        aList.add("Manisha");
        aList.add("Gauri");
        System.out.println(" The element at index 3 in the ArrayList is : " + aList.get(1));
    }
}
