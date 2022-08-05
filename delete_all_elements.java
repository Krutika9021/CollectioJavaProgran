import java.util.*;
public class delete_all_elements 
{
    public static void main(String args[])
    {  
        TreeMap<String,String> map1 = new TreeMap<String,String>();      
   
        map1.put("C1", "Government");
        map1.put("C2", "Polytechnic");
        map1.put("C3", "Poona");
       
        System.out.println("Orginal TreeMap content: "+map1);
        map1.clear();
        System.out.println("The New map: "+map1);
 }
}
