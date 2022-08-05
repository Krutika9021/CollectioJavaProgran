//Write a Java program to create a new array list, add some colors (string) and print out the collection.


package arraylist;
import java.util.ArrayList;

class Main 
{
  public static void main(String[] args)
  {
    ArrayList<String> languages = new ArrayList<>();

    languages.add("Java");
    languages.add("Python");
    languages.add("c++");
    System.out.println("ArrayList: " + languages);
  }
}
