//Write a Java program to remove all of the mappings from a map.


import java.util.*;
public class RemoveElements
{
    public static void main (String args[])
    {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(1, "Vovlo");
        hashmap.put(1, "BMW");
        hashmap.put(1, "lamborghinni");
        hashmap.put(1, "Ferrari");
        hashmap.put(1, "Honda");
        
        System.out.println("The original Hash Map : " + hashmap);
        hashmap.clear();
        System.out.println("The new Map : " + hashmap);
    }
}
