package Collections;

import java.util.Iterator;
import java.util.TreeSet;
public class tset {
 public static void main(String[] args) {
  TreeSet<Integer> t=new TreeSet<Integer>();
  t.add(5);
  t.add(8);
  t.add(7);
  t.add(10);
  t.add(5);
  t.add(0);
  System.out.println("The size of the set is: " + t.size()); 
  System.out.println(t);
  Iterator i1=t.iterator();
  while(i1.hasNext())
  {
   Object o=i1.next();
   Integer i=(Integer)o;
   System.out.println(i);
   }
   
  int value = t.floor(5); 
        System.out.println("Floor value for 5: " + value); 
        int v = t.ceiling(5); 
        System.out.println("Floor value for 5: " + v); 
  t.remove(7); 
  System.out.println("After removing element " + t); 
  System.out.println("Does the Set contains 4 "+ t.contains(4)); 
  t.pollFirst();
  System.out.println("After removing first " + t);
  t.pollLast();
  System.out.println("After removing first " + t);
  System.out.println("Is the set empty " + t.isEmpty()); 
  t.clear();
  System.out.println("Is the set empty " + t.isEmpty());
   }
  }
