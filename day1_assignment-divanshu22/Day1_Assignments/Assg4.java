package com;

import java.util.Scanner;


public class Assg4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three digit number : ");
		int no = sc.nextInt();
		int h = no / 100; //finding hundredth digit no.
		int t = (no / 10) % 10; //finding tenth digit no.
		int u = no % 10; //finding unit digit no. 
		System.out.println("("+h+"*"+"100"+"+"+t+"*"+"10"+"+"+u+")");
		sc.close();

	}

}
