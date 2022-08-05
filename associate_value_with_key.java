import java.util.*;
public class associate_value_with_key
{
    public static void main(String args[])
    {
        HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
        hashmap.put(1,"Krutika");
        hashmap.put(2,"Manisha");
        hashmap.put(3,"Gauri");
        hashmap.put(4,"Shweta");
        hashmap.put(5,"Simran");
        
        for(Map.Entry x : hashmap.entrySet())
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
