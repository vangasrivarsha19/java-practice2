package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsPractice {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(40);
		set.add(30);
		set.add(50);
		System.out.println(set);
		//for loop wont work
		
		for(Integer num : set) {
			System.out.println(num);
		}
		System.out.println("=============");
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		System.out.println(set.size());
		
		System.out.println(set);
		set.remove(50);
		System.out.println(set);
		
		System.out.println("===============");
		
		LinkedHashSet<Integer> linkedset = new LinkedHashSet<Integer>();
		
		linkedset.add(10);
		linkedset.add(20);
		linkedset.add(10);
		linkedset.add(30);
		linkedset.add(40);
		linkedset.add(40);
		
		System.out.println(linkedset.size());
		System.out.println(linkedset);
		
		set.add(null);
		System.out.println(set);
		
		
		System.out.println("===============");
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		treeset.add(50);
		treeset.add(30);
		treeset.add(10);
		treeset.add(30);
		treeset.add(40);
		treeset.add(30);
		treeset.add(20);
		//treeset.add(null);
		//System.out.println(treeset);
		System.out.println(treeset.size());
		System.out.println(treeset);
		
		



		
	}

}
