package com.visa.training.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda21 {
	
	public static void main(String[] args) {
		EX();
	}

	private static void EX() {
String[] a= {"HI","THIS","IS","SREENIDHI"};
allMatches(Arrays.asList(a),aB->aB.length()>3);
System.out.println(Arrays.asList(a));

	}

	public static <T> void allMatches(List<T> l,Predicate<T> condition) {
List<T> L=new ArrayList<T>();
for(T i:l) {
	if(condition.test(i)) {
		L.add(i);
	}
		
}
System.out.println(L);
System.out.println(L);
}
	
	
	
	
	
}
