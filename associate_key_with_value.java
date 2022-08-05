import java.util.*;
public class associate_key_with_value 
{
    public static void main(String args[])
    {
        TreeMap <Integer, String> map = new TreeMap <Integer, String>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");
        map.put(4, "Pink");
        
        for(Map.Entry<Integer, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }   
    }
}
