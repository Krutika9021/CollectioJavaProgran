//Write a Java program to insert the specified element at the specified position in the linked list.


import java.util.LinkedList;

public class Insert_Element 
{
    public static void main(String args[])
    {
       LinkedList<String> l_list = new LinkedList <>();
       
       l_list.add("Red");
       l_list.add("Green");
       l_list.add("Blue");
       l_list.add("Yellow");
       
       System.out.println("Original linked list : "+ l_list);
       System.out.println("Insert element after red. " + l_list);
       l_list.add(1,"Black");
       System.out.println("The linked list is : " + l_list);
    }
}
