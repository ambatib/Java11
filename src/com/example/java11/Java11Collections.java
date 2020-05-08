package com.example.java11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Java11Collections {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
        names.add("alex");
        names.add("brian");
        names.add("charles");
        print(names);
        String[] namesArr2 = names.toArray(String[]::new);   
        System.out.println(namesArr2.length);
        
        String currentTime = null;
        
        System.out.println(!Optional.ofNullable(currentTime).isPresent());  //It's negative condition
        System.out.println(Optional.ofNullable(currentTime).isEmpty());     //Write it like this
 
        currentTime = "12:00 PM";
 
        System.out.println(!Optional.ofNullable(currentTime).isPresent()); //It's negative condition
        System.out.println(Optional.ofNullable(currentTime).isEmpty()); 
	}
	
	@SafeVarargs
	private static void print(List... names) 
    { 
        for (List<String> name : names) { 
            System.out.println(name); 
        } 
    } 

}
