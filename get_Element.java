import java.util.TreeSet;
public class get_Element 
{
    public static void main(String args[])
    {
        TreeSet<String> t_set = new TreeSet<String>();
        t_set.add("Volvo");
        t_set.add("BMW");
        t_set.add("Lamborghini");
        t_set.add("Ferrari");
        t_set.add("Range Rover");
        
        System.out.println("Tree Set : " + t_set);
        
        Object first_element = t_set.first();
        System.out.println("First element is : " + first_element);
        
        Object last_element = t_set.last();
        System.out.println("Last element is : " + last_element);
    }
}
