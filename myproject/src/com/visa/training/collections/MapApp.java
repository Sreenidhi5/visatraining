package com.visa.training.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class MapApp {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String key,value;
	Map<String,String> m =new HashMap();
	for(int i=0;i<5;i++)

	{
		key=s.nextLine();
		value=s.nextLine();
	m.put(key, value);	
	}
	System.out.println("enter emp id");
	key=s.nextLine();
	System.out.println(m.get(key));
	}
}
