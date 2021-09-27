public class TestMultiCatch {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string in number format");
		try {
			
			int x = Integer.parseInt(scan.next());
			System.out.println("Enter some number to divide");
			int y = scan.nextInt();
			int result = x /y;
			System.out.println("Result = "+result);
		} catch(NumberFormatException e) {
			System.err.println("catching number format exception");
			e.printStackTrace();
		} catch(Exception e) {
			System.err.println("catching all the exceptions");
			e.printStackTrace();
		}
		scan.close();

}


public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] items = {3, 4, 1, 2, 5};
		
		try 
		{
			System.out.println("Items at specific index: "+items[8]); // accessing the index
		} 
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("catching AIOBE:"+e.getMessage());
			System.out.println("catching AIOBE: "+e);
		}
		// let us read two int & divide them
		
		try {
			System.out.println("Enter two numbers:-");
			int x = scan.nextInt();                       // chance of Input mistmatch Exception
			int y = scan.nextInt();
			int result = x/y;                             // chance of ArithmeticException object
			System.out.println("Result = "+result);
		} catch(ArithmeticException e) {
			System.out.println("catching AE: "+e.getMessage());
			System.out.println("catching AE: "+e);
		} finally {
			System.out.println("This is finally block statement");
		} 
