package com;
import java.util.Arrays;   


public class Asg6 {
	
	static void display(int []a)
	{
		for (int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}
	static void sort(int []a)
	{
		Arrays.sort(a);
		System.out.println("Elements of array sorted in ascending order : ");  
		for (int i = 0; i < a.length; i++)   
		{       
		System.out.println(a[i]);   
		}   
		
	}
	
	static void occurrence(int []a, int n, int x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == a[i])
              res++;
        System.out.println(res);
    }

	static int[] insert(int n, int arr[], int x, int p)
	{
		
		int i;
        int newarr[] = new int[n + 1];
        for (i = 0; i < n + 1; i++) {
            if (i < p - 1)
                newarr[i] = arr[i];
            else if (i == p - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
		
	}
	

}

