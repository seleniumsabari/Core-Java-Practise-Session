package org.corejava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	int factorial=1;
	Scanner sn=new Scanner(System.in);
	System.out.println("Enter the Number :");
	int n = sn.nextInt();
	for (int i = 1; i <=n; i++) {
		factorial=factorial*i;
	}
	
	System.out.println(factorial);
	}
}
