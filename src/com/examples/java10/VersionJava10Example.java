package com.examples.java10;

import java.lang.Runtime.Version;

public class VersionJava10Example {

	public static void main(String[] args) {
		Version version = Runtime.version();
		System.out.println(version);
		System.out.println(version.feature());
		System.out.println(version.interim());
		System.out.println(version.update());
		System.out.println(version.patch());

	}

}
