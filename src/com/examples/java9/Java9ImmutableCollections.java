package com.examples.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java9ImmutableCollections {

	public static void main(String[] args) {
		List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");  
        for(String l:list) {  
            System.out.println(l);  
        } 
        
        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");  
        for(String l:set) {  
            System.out.println(l);  
        }  
        
        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");  
        for(Map.Entry<Integer, String> m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());  
        }  
        
        //Creating Map Entry  
        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");  
        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");  
        // Creating Map using map entries  
        Map<Integer, String> map1 = Map.ofEntries(e1,e2);  
        // Iterating Map   
        for(Map.Entry<Integer, String> m : map1.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());  
        }  

	}

}
