package com;

public class Test {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Flm");
		sb.append(" Edutech");
		
		System.out.println(sb);
		
		System.out.println(sb.length());
		sb.insert(3, "-");
		System.out.println(sb);
		sb.replace(3, 5, "-");
		System.out.println(sb);
		
		sb.delete(3, 11);
		System.out.println(sb);
		
		//sb.deleteCharAt(6);
		//System.out.println(sb);
		
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuilder sb2 = new StringBuilder("hello");
		System.out.println(sb2);
		
		
		StringBuilder st = new StringBuilder();
		
		st.append("JAVA PROGRAMMING");
		System.out.println(st.length());
		System.out.println(st.capacity());
		
		StringBuilder st2 = new StringBuilder();
		st2.append("JAVA PROGRAMMING");
		System.out.println(st2.length());
		System.out.println(st2.capacity());
		
		StringBuilder st3 = new StringBuilder("FLMM");
		System.out.println(st3.length());
		System.out.println(st3.capacity());
		
		
		//string builder directly do not assign to string 
		//to assign use to string
		
		String str = st3.toString();
		System.out.println(str);
		
		StringBuffer sbuf = new StringBuffer();
		sbuf.append("hhh");
		System.out.println(sbuf);
		
	}

}
