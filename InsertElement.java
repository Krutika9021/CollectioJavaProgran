//Write a Java program to insert an element into the array list



import java.util.*;

public class InsertElement 
{
    public static void main (String args[])
    {
        List<String> Stringslist = new ArrayList<String>();
        Stringslist.add("Audi");
        Stringslist.add("BMW");
        Stringslist.add("Ferrari");
        System.out.println(Stringslist);
        
        Stringslist.add("Ford");
        Stringslist.add("Fiat");
        System.out.println(Stringslist);
    }
}
