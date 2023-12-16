package org.string;
import java.util.Scanner;
public class tocheck {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String input =sc.next();
if(input.contains("@"))
System.out.println("valid email id");
else
System.out.println("invaild emailid");
}
}
