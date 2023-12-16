package org.string;
public class startendwith {
	public static void main(String args[]) {
		String s ="Welcome To Java class";
		System.out.println(s.startsWith("Welcome"));
		String s1 ="Hai i am nisha";
		System.out.println(s1.startsWith("Welcome"));
		String s2 ="Welcome To Java class";
		System.out.println(s2.endsWith("class"));
		String s3 ="Welcome To Java class";
		System.out.println(s3.endsWith("java"));
		String s4="";
		System.out.println(s4.isEmpty());
		String s5="Nia";
		String s6="nisha";
		System.out.println(s5.equals(s6));
		String s7 ="Nisha";
		String s8  ="Nisha";
		System.out.println("String 1 "+System.identityHashCode(s7));
		System.out.println("String 2 "+System.identityHashCode(s8));
		String s9 ="Nisha";
		String s10 ="Rengan";
		String s11 ="NishaRengan";
		System.out.println("String 1 "+System.identityHashCode(s9));
		System.out.println("String 2 "+System.identityHashCode(s10));
		System.out.println("String 1 "+System.identityHashCode(s11));
	}
}
