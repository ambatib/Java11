package com.example.java11;

import java.util.stream.Collectors;

class A {
	public static void main(String a[]) {
		System.out.println("Hello world");
	}
}

public class Java11Strings {

	public static void main(String[] args) {
		System.out.println("       ".isBlank()); // true
		String str = "JD\nJD\nJD";
		System.out.println(str.lines());
		System.out.println(str.lines().collect(Collectors.toList())); // lines()

		String str1 = " JD ";
		System.out.print("Start");
		System.out.print(str1.strip()); // strip() - will strip at both ends
		System.out.println("End");

		System.out.print("Start");
		System.out.print(str1.stripLeading()); // stripLeading() -- strip at leading end
		System.out.println("End");

		System.out.print("Start");
		System.out.print(str1.stripTrailing()); // stripTrailing()- strip at trailing end
		System.out.println("End");

		String str2 = "=".repeat(3);
		System.out.println(str2); // prints == //repeat # of times
		l1: for (int i = 0; i < 5; i++) {
			System.out.println(i);
			for (int j = 0; j < 4; j++) {
				System.out.println(j);
				if (j == 2)
					break l1;
			}
		}
	}

}
