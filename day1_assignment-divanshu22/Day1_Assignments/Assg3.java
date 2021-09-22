package com;

import java.util.Scanner;

public class Assg3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 nnumber : ");
		int f = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		
		int max = max(f,s,t);
		int min = min(f,s,t);
		int sum = sum(max,min);
		System.out.println("Sum of the numbers is : "+sum);
		
		sc.close();
		
}
	public static int max(int f,int s, int t) {
		int max = f; //using if cases to make comparisons
		if(s>f) {
			max = s;
		}
		if(t>max) {
			max = t;
		}
		return max;
	}
	
	public static int min(int f,int s, int t) {
		int min = f;
		if(s<min) {
			min = s;
		}
		if(t<min) {
			min = t;
		}
		return min;
	}
	
	public static int sum(int max, int min) {
		int sum = max + min;
		return sum;
	}


}
