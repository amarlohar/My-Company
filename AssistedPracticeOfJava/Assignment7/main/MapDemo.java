package main;

import java.util.*;
public class MapDemo {
public static void main(String[] args) {
	// map
	//Hashmap
	HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
	hm.put(1,"Tushar"); 
	hm.put(2,"Mayur"); 
	hm.put(3,"mahesh"); 
 
	System.out.println("\nThe elements of Hashmap are "); 
	for(Map.Entry m:hm.entrySet()){ 
	System.out.println(m.getKey()+" "+m.getValue()); 
 }
 
	//HashTable
 
	 Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
	 
	 ht.put(4,"Aadesh"); 
	 ht.put(5,"Rohit"); 
	 ht.put(6,"Jaydeep"); 
	 ht.put(7,"Jogindar"); 
	 System.out.println("\nThe elements of HashTable are "); 
	 for(Map.Entry n:ht.entrySet()){ 
	 System.out.println(n.getKey()+" "+n.getValue()); 
 }
 
 
	 //TreeMap
 
	 TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
	 map.put(8,"Anita"); 
	 map.put(9,"ankit"); 
	 map.put(10,"onkar"); 
 
	 System.out.println("\nThe elements of TreeMap are "); 
	 for(Map.Entry l:map.entrySet()){ 
	 System.out.println(l.getKey()+" "+l.getValue()); 
 } 
 
 } 
}
