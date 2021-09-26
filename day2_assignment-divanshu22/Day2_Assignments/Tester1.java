package com;
import java.util.Scanner;
class Tester1 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1");
		int n1 = sc.nextInt();
		System.out.println("enter number 2");
		int n2 = sc.nextInt();
		Asg1 as = new Asg1();
		
		for (int i=n1;i<=n2;i++)
		{
			System.out.println(as.fctr(i));
		}
		


		sc.close();

}
}
