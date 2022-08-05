import java.util.*;
import java.util.Iterator.*;
public class Get_Size 
{
    public static void main(String[] args)
    {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Gauri");
        h_set.add("Shweta");
        h_set.add("Pratiksha");
        h_set.add("Simran");
        
        System.out.println("Original HashSet : " + h_set);
        System.out.println("Size of the Hash Set : " + h_set.size());
    }
}
