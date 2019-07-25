package com.visa.training.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()>o2.length())return 1;
		if(o1.length()<o2.length())return -1;
		else
		return 0;
	}
	
}


public class SetDemo {
	
	
	public static <T> void mySort(Set s,Comparator<T> c) {//T is type to be compared
		//Comparator<? super T> TO USE FROM BASE CLASS
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<String> set= new HashSet<String>();
		for(int i=0;i<10;i++) {
			System.out.println("enter the element");
			String k=s.nextLine();
			if(!set.add(k)) {
				System.out.println("Duplicate element detecteeeeeed");
			}
		}
System.out.println(set.size());
System.out.println(set);
	//	Collections.sort(set, new StringLengthComparator());

mySort(set,new StringLengthComparator());

	}

}
