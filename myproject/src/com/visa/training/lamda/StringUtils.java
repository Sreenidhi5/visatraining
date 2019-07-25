package com.visa.training.lamda;

import java.util.List;
import java.util.function.Predicate;

public class StringUtils {

	public static String betterString(String s1, String s2, TwoStrings condition) {
		if (condition.isFirstBetter(s1, s2))
			return s1;
		else
			return s2;
	}
	
//	public static List<String> allMatches(List<String> l,Predicate<String> condition){
//		
//		if(condition.isFirstBetter(l.))
//	}

	public static <T> T betterElement(T s1, T s2, TwoElementPredicate<T> condition) {
		if (condition.isFirstBetter(s1, s2))
			return s1;
		else
			return s2;
	}

	public static void main(String[] args) {

		ex3();
	}

	
	  private static void ex3() { String
	  longer=betterString("abcD","def",(arg1,arg2)->arg1.length()>arg2.length());
	  System.out.println(longer); }
	  
	 
	public static int eChecker(String s1, String s2) {
		if (s1.contains("e") && !s2.contains("e"))
			return -1;
		if (!s1.contains("e") && s2.contains("e"))
			return 1;
		else
			return 0;

	}
}
