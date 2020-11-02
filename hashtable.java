package Collections;

import java.util.Hashtable;
import java.util.Iterator;

public class hashtable {
 public static void main(String[] args) {

  Hashtable<Integer, String> hashtable = new Hashtable<>();

  hashtable.put(1,"A");
  hashtable.put(2,"B" );
  hashtable.put(3,"C");
  System.out.println(hashtable);
  String value = hashtable.get(1);       
  System.out.println(value);
  hashtable.remove(3);            
  Iterator<Integer> itr = hashtable.keySet().iterator();
  
  while(itr.hasNext()) 
  {
   Integer key = itr.next();
   String mappedValue = hashtable.get(key);

   System.out.println("Key: " + key + ", Value: " + mappedValue);
      }
     }
    }
