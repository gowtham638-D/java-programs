package org.string;
public class replace {
	public static void main(String args[]) {
		String s ="Welcome to class java";
		System.out.println(s.replace("java","sql"));
		String s1 ="Greens Adayar";
		System.out.println(s1.replace("Adayar","omr"));
		String s2 ="Welcome to class java";
		System.out.println(s2.replace(" ","#"));
		String s3 ="Nishakerala24@gmail.com";
		System.out.println(s3.replace("gmail","yahoo"));
		String s4 ="5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		System.out.println(s4.replace(",pincode-626101"," "));
}
}
