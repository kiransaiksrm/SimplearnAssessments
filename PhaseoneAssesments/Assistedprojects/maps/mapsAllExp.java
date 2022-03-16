package mapsexp;
import java.util.*;
public class mapsAllExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();     

		      hm.put(1,"ramu");   
		      hm.put(2,"siri");   
		      hm.put(3,"kiran");  

		      System.out.println("\nThe elements of Hashmap are "); 

		      for(Map.Entry m:hm.entrySet()){   

		       System.out.println(m.getKey()+" "+m.getValue());   

		      }


		      //hash table

		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
		      ht.put(4,"raju"); 
		      ht.put(5,"Rosy"); 
		      ht.put(6,"ajay"); 
		      ht.put(7,"hanith"); 
		      System.out.println("\nThe elements of HashTable are "); 

		      for(Map.Entry n:ht.entrySet()){   

		       System.out.println(n.getKey()+" "+n.getValue());   

		      }

		      //TreeMap

		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();   
		      map.put(8,"pavithra");   
		      map.put(9,"thanuja");   
		      map.put(10,"Catie");      
		      System.out.println("\nThe elements of TreeMap are "); 

		      for(Map.Entry l:map.entrySet()){   

		       System.out.println(l.getKey()+" "+l.getValue());   

		      }   
		      
	} 
	
}


