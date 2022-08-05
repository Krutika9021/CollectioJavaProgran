//Write a Java program to test a hash set is empty or not.


import java.util.HashSet;
 
public class Empty_Or_Not
{
 
    public static void main(String[] args)
    {
        
        HashSet<String> hsetColors = new HashSet<String>();
        
        System.out.println("HashSet empty: " + hsetColors.isEmpty());
         
        hsetColors.add("Red");
        hsetColors.add("Green");
        
        System.out.println("HashSet empty: " + hsetColors.isEmpty());        
    }
}
