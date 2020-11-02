package Collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;

public class Linkedlist {

 public static void main(String[] args) {
  LinkedList<String> languages = new LinkedList<>();
     languages.add("Java");
     languages.add("Python");
     languages.add("JavaScript");
     languages.add("Java");
     System.out.println("LinkedList: " + languages);
     Spliterator<String> splitr = languages.spliterator();  
   System.out.println("Estimate size: " + splitr.estimateSize());  
  System.out.println("List of names");  
  while(splitr.tryAdvance((num) -> System.out.println("" +num)));  
  ListIterator li=languages.listIterator();
  System.out.println("Iterating in forward direction");
  while(li.hasNext())
   System.out.println(li.next());
  System.out.println("Iterating in backward direction");
  while(li.hasPrevious())
   System.out.println(li.previous());
  Enumeration<String> e = Collections.enumeration(languages); 
       System.out.println("\nEnumeration over list: "); 
       while (e.hasMoreElements()) 
           System.out.println("Value is: " + e.nextElement());
     languages.set(3, "Kotlin");
     System.out.println("Updated LinkedList: " + languages);
     String str = languages.get(1);
     System.out.print("Element at index 1: " + str);
      languages.remove(1);
      String str1 = languages.peek();
      System.out.println("Accessed Element: " + str1);
      String str2 = languages.poll();
      System.out.println("Removed Element: " + str2);
      System.out.println("LinkedList after poll(): " + languages);
      languages.clear();
      System.out.println(languages.isEmpty());
      
      
      
      }
      
      }
