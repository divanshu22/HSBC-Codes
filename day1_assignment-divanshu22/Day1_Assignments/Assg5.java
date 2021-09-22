package com;

public class Assg5
{

	public static void add(long x, long y){ //employing method overloading
    	System.out.println(x+y);
    }
	
	public static void add(float x, float y){
    	System.out.println(x+y);
    }
	
	public static void add(short x, short y){
    	System.out.println(x+y);
    }
	

	 public static void main(String[] args)
	{
	
		 add(3,4);
		 add(12.4f,3.6f);
		 add(2352462462l,3252462472l);
		
	}
        
	
}