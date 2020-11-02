package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Spliterator;

public class Arraylistwithlistiterator {
	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();  
		alist.add("tinkuu");
		alist.add("likhi");
		alist.add("shobhi")
    
		alist.add("hero");
		alist.add("jack");
		alist.add("lakshmi");
		System.out.println(alist);
		Spliterator<String> splitr = alist.spliterator();  
		 System.out.println("Estimate size: " + splitr.estimateSize());  
		System.out.println("List of names");  
		while(splitr.tryAdvance((num) -> System.out.println("" +num)));  
    ListIterator li=alist.listIterator();
		System.out.println("Iterating in forward direction");
		while(li.hasNext())
			System.out.println(li.next());
		System.out.println("Iterating in backward direction");
		while(li.hasPrevious())
			System.out.println(li.previous());
		Enumeration<String> e = Collections.enumeration(alist); 
        System.out.println("\nEnumeration over list: "); 
        while (e.hasMoreElements()) 
            System.out.println("Value is: " + e.nextElement()); 
            }
            
            }
