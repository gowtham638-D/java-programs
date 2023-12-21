package org.array;
public class arrayduplicate {
	public static void main(String args[]) {
	int a[] = {10,10,20,50,60,80,60,50};
	int b[] = a.clone();
	for (int i = 0; i < a.length; i++) {
		for (int j = 1; j < b.length; j++) {
			if(a[i]!=a[j]) {
				System.out.println(a[i]);
			}
			else {
				break;
			}
			
		}
		
	}
}
}
concept therila