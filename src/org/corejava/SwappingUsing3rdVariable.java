package org.corejava;

public class SwappingUsing3rdVariable {

	public static void main(String[] args) {
		int a=25,b=50,c=0;
		System.out.println("Before Swapping :");
		System.out.println("A="+a);
		System.out.println("B="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping :");
		System.out.println("A="+a);
		System.out.println("B="+b);
		
	}
}
