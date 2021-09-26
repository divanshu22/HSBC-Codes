package com;
import java.util.Scanner;
public class Tester6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ARRAY : ");
		int []arr = new int[10];
		for (int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n = arr.length;
		Asg6 asg = new Asg6();
		asg.display(arr);
		System.out.println("================================");
		asg.sort(arr);
		System.out.println("================================");
		System.out.println("Enter number whose occurance is being calculated : ");
		int d = sc.nextInt();
		asg.occurrence(arr,n,d);
		System.out.println("================================");
		System.out.println("Enter number: ");
		int x = sc.nextInt();
		System.out.println("Enter postition: ");
		int k = sc.nextInt();
		arr = asg.insert(n,arr,x,k);
		asg.display(arr);
		sc.close();
		
		
	}

}
