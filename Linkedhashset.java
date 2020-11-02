package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class Linkedhashset {
 public static void main(String[] args) {
 LinkedHashSet<String> linkedset = new LinkedHashSet<String>();   
linkedset.add("A");   
linkedset.add("B");   
linkedset.add("C");   
linkedset.add("D");
linkedset.add("A");  
linkedset.add("E");   
System.out.println("Size of LinkedHashSet = " + linkedset.size());   
System.out.println("Original LinkedHashSet:" + linkedset);   
System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));
System.out.println(linkedset);
System.out.println("Checking if A is present=" + linkedset.contains("A")); 
System.out.println("Updated LinkedHashSet: " + linkedset);   
 System.out.println("Using Iterator traverse the values is");
 Iterator i1=linkedset.iterator();
 
 while(i1.hasNext())
 {
  Object o=i1.next();
  String s=(String)o;
  System.out.println(s);
 }
 linkedset.clone();
 Spliterator<String> splitr = linkedset.spliterator();  
    System.out.println("List of names");  
    while(splitr.tryAdvance((num) -> System.out.println("" +num))); 
    
    
 System.out.println(linkedset);
 System.out.println("Is the set empty " + linkedset.isEmpty()); 
 linkedset.clear();
 System.out.println("Is the set empty " + linkedset.isEmpty());
 }
 
 
 }
