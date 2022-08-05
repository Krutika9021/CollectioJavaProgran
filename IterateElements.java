//Write a Java program to iterate through all elements in a array list.


import java.util.ArrayList;
public class IterateElements               
{
  public static void main(String args[])
  {
      ArrayList<String> languages = new ArrayList<>();
      
      languages.add("Java");
      languages.add("Python");
      languages.add("c++");
      System.out.println("ArrayList: ");
      languages.forEach((e) -> 
      {
          System.out.println(e+", ");
      });
  }
}
