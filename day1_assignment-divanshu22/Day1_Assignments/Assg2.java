package com;
import java.util.Scanner;

public class Assg2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp No : "); //taking employee no.
		int eno = sc.nextInt();
		System.out.println("Enter Name : "); // taking emp name 
		String name = sc.next();
		System.out.println("Enter Age : "); // taking emp age
		int age = sc.nextInt();
		System.out.println("Enter Country : "); // taking emp country
		String Country = sc.next();
		employee(eno,name,age,Country); //calling method in the main function
		sc.close();

	}
	
	public static void employee(int empno, String name, int age, String country)
	{
		System.out.println(empno+";"+name+";"+age+";"+country); //concatinating all
	}
}
