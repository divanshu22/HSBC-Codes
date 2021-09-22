package asg;
import java.util.Scanner;

public class Prod {

	public static void main(String[] args) { //tried using loops but had difficulty, will attempt this question again after next class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Prod ID : ");
		int pid=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Prod Name : ");
		String pname=sc.nextLine();
		System.out.println("Description : ");
		String des=sc.nextLine();
		System.out.println("Price : ");
		float price=sc.nextInt();
		System.out.println("Max Discount : ");
		float maxdis=sc.nextInt();
		System.out.println("Month : ");
		int month=sc.nextInt();
		System.out.println("Year : ");
		int year=sc.nextInt();
		
		Info i1=new Info();
		i1.setPid(pid);
		i1.setDes(des);
		i1.setPname(pname);
		i1.setMaxdis(maxdis);
		i1.setM(month);
		i1.setY(year);
		i1.setPrice(price);
		getDiscountedPrice(i1);
		getTotalPriceForItems(i1,5);
		getDiscountedPriceForItems(i1,5);
		sc.close();
		
		// TODO Auto-generated method stub

	}
	static void getDiscountedPrice(Info i1)
	{
		float x= i1.getPrice() - i1.getMaxdis();
		System.out.println("Discounted Final Price : "+ x);
	}
	static void getTotalPriceForItems(Info i1, int x)
	{
		float y=i1.getPrice()*x;
		System.out.println("Total Price for Items  : "+ y);
		
	}
	
    static void getDiscountedPriceForItems(Info i1, int x)
    {
    	float r= i1.getPrice() - i1.getMaxdis();
    	float fin=r*x;
    	System.out.println("Discounted Price For All Items : "+ fin);
    	
    	
    }
}