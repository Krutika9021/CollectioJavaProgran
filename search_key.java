import java.util.*;
public class search_key
{
    public static void main(String args[])
    {
        TreeMap<Integer, String> map = new TreeMap <Integer, String>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");
        map.put(4, "Pink");
        
        System.out.println(map);
        if(map.containsKey(1))
        {
            System.out.println("The Tree Map contains key 1");
        }
        else
        {
            System.out.println("The Tree Map does not contain key 1");
        }
        if(map.containsKey(5))
        {
            System.out.println("The Tree Map contains key 5");
        }
        else
        {
            System.out.println("The Tree Map does not contain key 5");
        }
    }
}
