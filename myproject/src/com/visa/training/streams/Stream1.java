package com.visa.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Stream1 {
	public static void main(String[] args) {
		EX1();
		
		
	}
	
public static void EX1() {
List<String> words=Arrays.asList("HI","THIS","IS","SREE");

words.stream().map(e->" \t\t ".concat(e)).forEach(System.out::println);


Stream.of(words).collect(Collectors.toList());

}
}
