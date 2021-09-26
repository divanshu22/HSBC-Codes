package com;
import java.util.Scanner;
public class Tester8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int [] arr= new int[10];
		for (int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Asg8 asg= new Asg8();
		asg.convertor(arr);
		sc.close();
	}

}
