package com.hsbc.Day4;

interface Add{
	public void add(int x,int y);
	
}
interface sub{
	public void subtract(int x,int y);
}

interface cal extends Add,sub{
	public void printinfo(int z);
	
}
class Class1 {
	protected int token;
	public Class1(int x)
	{
		token=x;
	}
	public void mul(int num1)
	{
		int z=num1*token;
		System.out.println("MULTIPLIED : "+z);
	}
	

}
class new1 extends Class1 implements Add,sub {
	protected int var4;
	
	public new1(int x,int var4) {
		super(x);
		this.var4=var4;
		// TODO Auto-generated constructor stub
	}
	public void div() {
		int numb=var4/token;
		System.out.println("DIVIDED : "+numb);
	}

	@Override
	public void subtract(int x, int y) {
		int result=x-y;
		printresult(result);
		
	}

	@Override
	public void add(int x, int y) {
		int result=x+y;
		printresult(result);
		
	}
	public void printresult(int res)
	{
		System.out.println("RESULT  : "+ res);
	}
	




}
public class Asg4{
	public static void main(String[] args)
	{
		Add obj1= new new1(4,5);
		obj1.add(7, 8);
		sub obj2=new new1(7,6);
		obj2.subtract(7,6);
		
		
	}


}