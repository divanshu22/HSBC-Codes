package com;
import java.util.Scanner;
public class Tester3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int d = sc.nextInt();
		Asg3 asg=new Asg3();
		asg.add(d);
		sc.close();
	}

}
