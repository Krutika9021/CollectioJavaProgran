import java.util.*;
public class empty_or_not
{
    public static void main (String args[])
    {
        HashMap <Integer, String> map = new HashMap <Integer, String>();
        map.put(1, "Government");
        map.put(2, "Polytechnic");
        map.put(3, "Poona");
        boolean result = map.isEmpty();
        System.out.println("Is Hash map empty : " + result);
        map.clear();
        result = map.isEmpty();
        System.out.println("Is Hash map empty : " + result);
    }
}
