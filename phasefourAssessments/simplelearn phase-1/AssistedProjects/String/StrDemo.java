package com.app.strhndl;

public class StrDemo {

	public static void main(String[] args) 
	{ 
		String s1 = "hyderabad"; 
		int len = s1.length(); 
		System.out.println(len); 
		System.out.println(s1.charAt(4)); 
		String s2 = new String("satya"); 
		String lc = s2.toLowerCase(); 
		System.out.println(lc); 
		System.out.println(s2); 
		System.out.println(s1.toUpperCase()); 
		System.out.println(s1.toLowerCase()); 
		System.out.println(s1.concat(s2)); 
		String s3 ="SATYA"; 
		// compare content 
		if(s2.equals(s3)) 
		{ 
			System.out.println("same"); 
		} 
		else 
		{ 
			System.out.println("not same"); 
		} 
		// compare reference 
		if (s2==s3) 
		{ 
			System.out.println("same"); 
		} 
		else 
		{ System.out.println("not same"); 
		} 
		String s4 = "hello friends , how are you"; 
		System.out.println(s4.startsWith("hello")); 
		System.out.println(s4.endsWith("hello")); 
		System.out.println(s4.substring(5)); 
		System.out.println(s4.substring(7,12)); 
		String s5 = " students "; 
		System.out.println(s5); 
		System.out.println(s5.trim()); 
		String val[] = s4.split(" "); 
		for(int i=0;i<val.length; i++) 
		{ 
			System.out.println(val[i]); 
		} 
		int x = 25; 
		int y = 18; 
		System.out.println(x+y); 
		String s6 = String.valueOf(x); 
		String s7 = String.valueOf(y); 
		System.out.println(s6+s7); 

	} 
}
