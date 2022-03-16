package com.app.strbuffr;

public class StrDemo1 {


	public static void main(String[] args) 
	{ 
		StringBuffer sb = new StringBuffer("hyderabad"); 
		System.out.println(sb); 
		sb.append(" city"); 
		System.out.println(sb); 
		sb.insert(10,"new"); 
		System.out.println(sb); 
		StringBuilder ref = new StringBuilder("value");
		sb.replace(10,13,"old"); 
		System.out.println(sb); 
		sb.setCharAt(0,'k'); 
		System.out.println(sb); 
		sb.deleteCharAt(0); 
		System.out.println(sb); 
		sb.reverse(); 
		System.out.println(sb); 
	} 
} 




