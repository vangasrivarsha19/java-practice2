package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterations {
	
	public static void main(String[] args) {
		
		List<Integer>list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
	    list.add(40);
	    list.add(50);
	    
	    for(int i = 0;i<list.size();i++) {
	    	if(list.get(i)==30) {               //we can remove values in for loop
	    		int index = list.indexOf(30);
	    		list.remove(index);
	    	}
	    	System.out.println(list.get(i));
	    	
	    	
	    }
	    
	    System.out.println("==============");
	    
	    for(Integer num: list) {        //for each loop
	    	
	    	//if(num==30) {                         //we cannot remove the values from for each loop
	    		//int index = list.indexOf(30);     //it is called concurrent modifications
	    		//list.remove(index);
	    	//}
	    	System.out.println(num);
	    }
	    
	    
	    
	    
	    System.out.println("===============");
	    
	   Iterator<Integer>iterator = list.iterator();
	   
	   while(iterator.hasNext()) {
		   int num = iterator.next();
		   if(num==30) {
			   iterator.remove(); //use iterator to remove
		   }
		   System.out.println(num);
	   }
	    
	   
	   
	   
	   
	   
	   
	    System.out.println(list);
	    System.out.println("=======================");
	    list.add(2,30);
	    
	    ListIterator<Integer>iterator2 = list.listIterator();       //list iterator
	    //list.add(2,30);
	    System.out.println(list);
	    
	    System.out.println(iterator2.hasNext());
	    System.out.println(iterator2.next());  
	    System.out.println(iterator2.hasNext());
	    System.out.println(iterator2.next()); 
	    System.out.println(iterator2.hasNext());
	    System.out.println(iterator2.next()); 
	    System.out.println(iterator2.hasPrevious());
	    System.out.println(iterator2.previous()); 
	    System.out.println(iterator2.hasPrevious());
	    System.out.println(iterator2.previous()); 
	    System.out.println(iterator2.hasPrevious());
	    System.out.println(iterator2.previous()); 
	    //System.out.println(iterator2.hasPrevious());
	    //System.out.println(iterator2.previous()); 
	    
	    System.out.println(list);   
	    list.add(50); //list allow duplicates
	    list.add(null); //we can put null in list 1 or more than 1
	    System.out.println(list);
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
}
	
}