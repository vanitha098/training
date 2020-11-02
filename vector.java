package Collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class vector {

 public static void main(String[] args) {
   Vector<String> vec = new Vector<String>(7);  
         vec.add("Tiger");  
         vec.add("Lion");  
         vec.add("Dog");  
         vec.add("Elephant");  
         vec.addElement("Rat");  
         vec.addElement("Cat");  
         vec.addElement("Deer");  
         System.out.println("Size is: "+vec.size()); 
         System.out.println("Default capacity is: "+vec.capacity());  
         System.out.println("Elements are: "+vec);  
         if(vec.contains("Tiger"))  
         {  
            System.out.println("Tiger is present at the index " +vec.indexOf("Tiger"));  
         }  
         else  
         {  
            System.out.println("Tiger is not present in the list.");  
         }  
         System.out.println("The first animal of the vector is = "+vec.firstElement());   
           
         System.out.println("The last animal of the vector is = "+vec.lastElement()); 
         vec.removeElementAt(5);         
         System.out.println("Vector element after removal: " +vec);  
         Spliterator<String> splitr = vec.spliterator();
          System.out.println("Estimate size: " + splitr.estimateSize());  
  System.out.println("List of names");  
  while(splitr.tryAdvance((num) -> System.out.println("" +num)));  
  ListIterator li=vec.listIterator();
  System.out.println("Iterating in forward direction");
  while(li.hasNext())
   System.out.println(li.next());
  System.out.println("Iterating in backward direction");
  while(li.hasPrevious())
   System.out.println(li.previous());
  Enumeration<String> e = Collections.enumeration(vec); 
       System.out.println("\nEnumeration over list: "); 
       while (e.hasMoreElements()) 
           System.out.println("Value is: " + e.nextElement());
     vec.set(3, "Kotlin");
     System.out.println("Updated LinkedList: " + vec);
     
     System.out.println("Hash code of this vector = "+vec.hashCode()); 
         }
      }
