package com.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsPractice {
	
	public static void main(String[] args) {
		
		/*Map map = new HashMap();
		
		map.put(1,"Varsha");
		map.put(2, "Manjula");
		map.put(3, "Akshi");          //we cannot predict the order
		map.put("Sri", 12);
		map.put('A', 65);            //its giving warning because using all data types is not safe even though map allows heterogeneous
		map.put(4, "Manjula");
		map.put(3, "Reddy");
		map.put(1, 'A');
		map.put(null, "Vanga");
		map.put(null, "Surya");
		map.put(null, null);
		map.put(5, null);*/
		
		
		Map<Integer,String> map = new HashMap<Integer, String>();//generic
		map.put(1, "Flm");
		map.put(2, null);
		map.put(3, "fet");
		map.put(13, "Fsa");
		map.put(14, "edutech");
		map.put(5, "media");
		map.put(null, "front");
		
		//map.put("flm", 2); we cannot put like this in generics
		
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(5)); // it gives null if there is no value
	    System.out.println(map.get(null));   //for boolean it accepts true false null three values
	    
	    
	    
	    //3 ways to iterate
	    //ketset
	    //values
	    //entry set
	    
	    Set<Integer> keys = map.keySet();
	    
	    for(Integer key : keys) {
	    	
	    	System.out.println(key + " = " +map.get(key));
	    	
	    }
	    System.out.println("==================");
	   Collection<String> values =map.values();
	   
	   System.out.println(values);
	   System.out.println("=================");
	   
	   for(Map.Entry<Integer, String> entry :map.entrySet()) {
		   System.out.println(entry.getKey() + " = " + entry.getValue()); //entry gives key and values
	   }
	   
	   
	   map.entrySet().iterator();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	     
	}

}
