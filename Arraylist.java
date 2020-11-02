package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Arraylist {

 public static void main(String[] args) {
  ArrayList<String> alist=new ArrayList<String>();  
       alist.add("tinku");
       alist.add("likhi");
       alist.add("shobhi");
       alist.add("hero");
       alist.add("jack");
       alist.add("lakshmi");
       System.out.println(alist);
       alist.add(3, "mld");
       System.out.println(alist);
       System.out.println("Checking if Maha is present=" + alist.contains("Maha")); 
       alist.remove(1);
       alist.set(1, "For"); 
       System.out.println(alist);
        alist.clone();
       System.out.println(alist);
       System.out.println("Using Iterator traverse the values is");
   Iterator i1=alist.iterator();
   while(i1.hasNext())
   {
    Object o=i1.next();
    String s=(String)o;
    System.out.println(s);
    }
    
      System.out.println("Is the set empty " + alist.isEmpty()); 
  alist.clear();
  System.out.println("Is the set empty " + alist.isEmpty());
  
  }
  
  }
  
