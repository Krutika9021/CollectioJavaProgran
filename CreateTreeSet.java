import java.util.TreeSet;
public class CreateTreeSet
{
    public static void main(String args[])
    {
        TreeSet<String> t_set = new TreeSet<String>();
        t_set.add("Red");
        t_set.add("Blue");
        t_set.add("Yellow");
        t_set.add("Green");
        t_set.add("Black");
        
        System.out.println("Tree set : ");
        System.out.println(t_set);
    }
}
