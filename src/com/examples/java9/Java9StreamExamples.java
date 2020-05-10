package com.examples.java9;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9StreamExamples {

	public static void main(String[] args) {

		System.out.println(10 + 20 + "Javatpoint");
		System.out.println("Javatpoint" + 10 + 20);
//		for (int i = 0; 0; i++) { //compilation error
//			System.out.println("Hello Javatpoint"); 
//		}
		// System.out.println( getDaysInJava9(LocalDate.now(),
		// LocalDate.now().plusDays(10)) );
		// System.out.println( getDaysInJava9Weeks(LocalDate.now(),
		// LocalDate.now().plusWeeks(10)) );

		List<String> alphabets = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");

		List<String> subset1 = alphabets.stream().takeWhile(s -> !s.equals("d")).collect(Collectors.toList());
		System.out.println(subset1);

		List<String> subset2 = alphabets.stream().dropWhile(s -> !s.equals("d")).collect(Collectors.toList());

		System.out.println(subset2);
		// java 8
		List<Integer> numbers = Stream.iterate(1, i -> i + 1).limit(10).collect(Collectors.toList());

		System.out.println(numbers);

		// Java 9
		List<Integer> numbers9 = Stream.iterate(1, i -> i <= 10, i -> i + 1).collect(Collectors.toList());

		System.out.println(numbers9);

		Stream<String> stream = Stream.ofNullable("234");
		System.out.println(stream.count());

		stream = Stream.ofNullable(null);
		System.out.println(stream.count());

	}

	// Stream of dates with 1 day difference
	public static List<LocalDate> getDaysInJava9(LocalDate start, LocalDate end) {
		return start.datesUntil(end).collect(Collectors.toList()); // or
		// return start.datesUntil(end,Period.ofDays(1)).collect(Collectors.toList());
	}

	// Stream of dates with 1 week difference
	public static List<LocalDate> getDaysInJava9Weeks(LocalDate start, LocalDate end) {
		return start.datesUntil(end, Period.ofWeeks(1)).collect(Collectors.toList());
	}

}
