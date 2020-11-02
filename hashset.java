package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class hashset {
 public static void main(String[] args) {
  HashSet<String> h=new HashSet<String>();
  h.add("A");
  h.add("B");
  h.add("C");
  h.add("D");
  h.add("E");
  h.add("F");
  h.add("G");
  System.out.println("The size of the set is: " + h.size()); 
  System.out.println(h);
   System.out.println("Using Iterator traverse the values is");
  Iterator i1=h.iterator();
  while(i1.hasNext())
  {
   Object o=i1.next();
   String s=(String)o;
   System.out.println(s);
  }
  h.remove("F");
  System.out.println(h);
  System.out.println("Does the Set contains M "+ h.contains("M"));
  h.clone();
  System.out.println(h);
  System.out.println("Is the set empty " + h.isEmpty()); 
  h.clear();
  System.out.println("Is the set empty " + h.isEmpty());
  
  
  
  
  
     }
   }
