package com.java8.streams;

import java.util.stream.IntStream;

public class DemoSum {

	public static void main(String[] args) {
		
		
		
	int sum=	IntStream.rangeClosed(0, 100).sum();
	System.out.println(sum);
	}

}
