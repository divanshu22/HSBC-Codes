package com;

public class Tester5 {
	
	public static void main(String[] args) {
		String str = "Its a good day today";
		String str1 = "ITS A GOOD DAY TODAY";
		System.out.println("String A : "+str);
		System.out.println("String B : "+str1);
		System.out.println("=======================");
		System.out.println("Character at position 5: " + str.charAt(6)); //CharAt
		System.out.println("Contains sequence 'day': " + str.contains("day")); //contains
		System.out.println("Length: " + str.length()); //length
		System.out.println("Index of character 't': " + str.indexOf('t'));
		System.out.println(str.equals(str1)); //equals
		System.out.println(str.equalsIgnoreCase(str1)); //Ignore case
		String str2 = null;
		str2 = String.join(str,str2);  //join
		System.out.println(str2); 
		System.out.println(str.lastIndexOf("today")); //LastIndexOf
		System.out.println(str.substring(3,6)); //Substring
		System.out.println("Convert to LowerCase: " + str.toLowerCase()); //LowerCase
		System.out.println("Convert to UpperCase: " + str.toUpperCase()); //UpperCase
		System.out.println(str.trim());
		
		
		
	}

}
