package com;

public class Assg6

{
    
    public static int add(int x, int y){ //method overloading again in this question
        return x+y;
    }
    
    public static int add(int x, int y, int z){
        return x+y+z;
    }
    
    public static double add(double x, double y){
        return x+y;
    }
    
    public static String add(String x, int y){
        return x+" "+Integer.toString(y);
    }
	public static void main(String[] args) {
	    System.out.println(add(10,20));
	    System.out.println(add(10,20,30));
	    System.out.println(add(10.5,20.1));
	    System.out.println(add("Hello",10));
	}
}