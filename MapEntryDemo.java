package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryDemo {

 public static void main(String[] args) {
  HashMap<Integer,String> hm = new HashMap<>();
  hm.put(1,"Akhil");
  hm.put(2,"Mahesh");
  hm.put(3,"Banu");
  hm.put(4,"Abhinay");
  hm.put(5,"Akhil");
  hm.put(6,"Nikhil");
  hm.put(7,"Bunny");
  System.out.println(hm);
  Set<Map.Entry<Integer,String>> s= hm.entrySet();
  System.out.println("==========Using Iterator==========");
  Iterator<Map.Entry<Integer, String>> i = s.iterator();
   while(i.hasNext()) {
   Map.Entry<Integer, String> entry=i.next();
   System.out.println(entry.getKey()+" "+entry.getValue());
  }
  System.out.println("=========Using foreach loop=========");
  for(Map.Entry<Integer, String> entry: s) {
   System.out.println(entry.getKey()+" "+entry.getValue());
   }
  }
  
  }
