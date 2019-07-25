package com.visa.training.lamda;

import java.util.Arrays;
import java.util.Collections;

public class LambdaPart11 {

	public static void main(String[] args) {
		String[] a =new String[] {"navigate","through","eclipse","in","pc"};
	
	
System.out.println(Arrays.asList(a));

Collections.sort(Arrays.asList(a), (s1,s2)->s1.length()-s2.length());

System.out.println(Arrays.asList(a));

Collections.sort(Arrays.asList(a), (s1,s2)->s2.length()-s1.length());
System.out.println(Arrays.asList(a));

Collections.sort(Arrays.asList(a),(s1,s2)->s1.charAt(0)-s2.charAt(0));
System.out.println(Arrays.asList(a));

Collections.sort(Arrays.asList(a),(s1,s2)->{
	
if(s1.contains("e") && !s2.contains("e"))return -1;
if(!s1.contains("e") && s2.contains("e"))return 1;
else return 0;

});
System.out.println(Arrays.asList(a));

Collections.sort(Arrays.asList(a),StringUtils::eChecker);
System.out.println(Arrays.asList(a));


}

	}


