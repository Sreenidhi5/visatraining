package com.visa.training.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Stream3 {
	public static void main(String[] args) {
		EX3();
	}
	
	
	private static void EX3() {

//		List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
//		transformedList(nums,S->S+1);
//		System.out.println(nums);
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
//		nums.stream().map(num->num+1).forEach(System.out::println);
//		Stream.of(nums).collect(Collectors.toList());
//		System.out.println(nums);
		
		
//		nums.stream().filter(I->I>4).forEach(System.out::println);
//		Stream.of(nums).collect(Collectors.toList());
//	System.out.println(nums);
		
		List<String>arr = Arrays.asList("hi","hlo","txt");
		arr.stream().reduce((s1,s2)->s1.toUpperCase().concat(s2.toUpperCase()));
		=Stream.of(arr).collect(Collectors.toList());
	System.out.println(arr);
		

		
		
	}

	public static <T> void transformedList(List<T> L,Function<T,T> P) {
		List<T> A=new ArrayList<T>();
		for(T i:L) {
			A.add(P.apply(i));
		}
		System.out.println(A);
		
	}

}
