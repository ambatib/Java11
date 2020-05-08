package com.examples.java10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class VarExample {

	public static void main(String[] args) {
		var str = "Hello";
		System.out.println(str);

		var i = 10;
		System.out.println(i);

		var list = new ArrayList<String>(Arrays.asList("Hello", "World")); //inferred value arraylist
		System.out.println(list);
		
		// Index of Enhanced For Loop
		for (var number : list) {
			System.out.println(number);
		}
		// Local variable declared in a loop
		for (var j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
		
		String str1 = " ";
		Optional<String> name = Optional.ofNullable(str1);
		// New API added - is preferred option then get() method
		System.out.println(name.orElseThrow()); // same as name.get()  
		System.out.println(name.get());
		
		List<String> actors = new ArrayList<>();
		actors.add("Jack Nicholson");
		actors.add("Marlon Brando");
		System.out.println(actors); // prints [Jack Nicholson, Marlon Brando]
		// New API added - Creates an UnModifiable List from a List.
		List<String> copyOfActors = List.copyOf(actors);
		System.out.println(copyOfActors); // prints [Jack Nicholson, Marlon Brando]
		// copyOfActors.add("Robert De Niro"); Will generate an
		// UnsupportedOperationException
		actors.add("Robert De Niro");
		//copyOfActors.add("Robert De Niro");
		System.out.println(actors);// prints [Jack Nicholson, Marlon Brando, Robert De Niro]
		System.out.println(copyOfActors); // prints [Jack Nicholson, Marlon Brando]\

		
		
//		  var i1; //can't use var without initializer 
//		  var str1 = null; //can't infer  type for local initialize to null 
//		  var p = (String s) -> s.length() > 10; //lambda expression needs an explicit target-type 
//		  var arr = { 1, 2, 3 }; //array initializer needs an explicit target-type

		
		
//		String[] words = new String[10];   
//        Optional<String> checkNull = Optional.ofNullable(words[5]); 
//        //System.out.println(":"+checkNull.orElseThrow());
//        if (checkNull.isPresent()) {   
//            String word = words[5].toLowerCase();   
//            System.out.print(word);   
//        } else  
//            System.out.println("word is null");   
    	  	
	}
}
