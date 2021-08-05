package io.github.pavankumarpolavarapu.stringhandling;

import java.util.Arrays;

public class StringHandlingDemo {

	public static void main(String[] args) {
		String str1 = "This is a sample string";
		String str2 = "and another string";
		
		System.out.println(str1.length());
		
		String result = str1.concat(str2);
		System.out.println(result);
		
		String.format("The name of the student is" + "%s, and the age is " + "variable is %d", "John", 21);
		
		System.out.println(str1.charAt(5));
		
		if(str1.equals(str2)) {
 			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		System.out.println(str1.indexOf('l'));
		
		System.out.println(str1.replace('t', 'k'));
		
		String[] arr = str1.split(" ");
		
		Arrays.asList(arr).forEach(s -> System.out.println(s));
		
		String newStr1 = str1.substring(1, 3);
		System.out.println(newStr1);
	}

}