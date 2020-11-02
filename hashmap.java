package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();   
		   map.put(1,"Mango");  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(1,"Grapes");
		   System.out.println("Iterating Hashmap..."); 
        map.replace(2,"Lemon");
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   System.out.println("Key/Value mappings: " + map.entrySet());	  
	        System.out.println("Keys: " + map.keySet());
	        System.out.println("Values: " + map.values());
		   map.remove(1);  
		    System.out.println("Updated list of elements: "+map);
		    Collection entrySet = map.entrySet();
		    Iterator listItr = entrySet.iterator(); 
	        System.out.println("Forward Traversal:"); 
	        while (listItr.hasNext()) { 
	            System.out.println(listItr.next()); 
              }
              
           }
              
        }
