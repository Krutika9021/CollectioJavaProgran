import java.util.*;
public class get_all_keys 
{
    public static void main(String args[])
    {         
        TreeMap<String, String> map = new TreeMap <String, String>();
        map.put("1", "Gauri");
        map.put("2", "Krutika");
        map.put("3", "Manisha");
        map.put("4", "Aditi");
        
        Set<String> keys = map.keySet();
        for(String key: keys)
        {
            System.out.println(key);
        }
     }
}
