import java.util.*;
public class search_value 
{
    public static void main(String args[])
    {
        TreeMap<Integer, String> map = new TreeMap <Integer, String>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");
        map.put(4, "Pink");
        
       // System.out.println(map);
        if(map.containsValue("Green"))
        {
            System.out.println("The Tree Map contains value Green");
        }
        else
        {
            System.out.println("The Tree Map does not contain value Green");
        }
        if(map.containsValue("White"))
        {
            System.out.println("The Tree Map contains value White");
        }
        else
        {
            System.out.println("The Tree Map does not contain value White");
        }
    }
}
