package Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class Treemap {
 public static void main(String[] args) {
  TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
  map.put(100,"tinku");    
  map.put(102,"Ravi");    
  map.put(101,"Vijay");    
  map.put(103,"Rahul");
  System.out.println("TreeMap entries : ");
  Collection entrySet = map.entrySet();
   Iterator it = entrySet.iterator();
  while(it.hasNext())
  System.out.println(it.next());
  System.out.println("The size of the map is " + map.size()); 
  System.out.println(map);
  System.out.println("The set is: " + map.entrySet()); 
  System.out.println("descendingMap: "+map.descendingMap());  
  System.out.println("headMap: "+map.headMap(102,true));  
  System.out.println("tailMap: "+map.tailMap(102,true));  
  System.out.println("subMap: "+map.subMap(100, false, 102, true)); 
  System.out.println("The greatest key less than 105 is : "+ map.floorKey(105));
  map.clear();
  System.out.println(map.isEmpty());
  
  
  
  }
  
  }
