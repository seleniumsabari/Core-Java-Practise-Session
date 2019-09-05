package org.corejava;

import java.util.Scanner;

public class Voting {
      public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int n = sn.nextInt();
		if(n>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not Eligible to vote");
		}
	}
}
