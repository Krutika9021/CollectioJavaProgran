import java.util.TreeSet;
public class Iterate_Element 
{
    public static void main(String args[])
    {
        TreeSet<String> t_set = new TreeSet<String>();
        t_set.add("Government");
        t_set.add("Polytechnic");
        t_set.add("Poona");
        
        for(String element:t_set)
        {
            System.out.println(element);
        }
    }
}
