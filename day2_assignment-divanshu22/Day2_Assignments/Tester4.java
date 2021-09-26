package com;
import java.util.Scanner;
public class Tester4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String d = sc.nextLine();
		Asg4 asg= new Asg4();
		System.out.println(asg.wc(d));
		sc.close();
	}

}
