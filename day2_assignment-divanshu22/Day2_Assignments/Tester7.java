package com;
import java.util.Scanner;
public class Tester7 {
	
	 public static void Matrix(Scanner scan, int num[][], int rows, int columns)
	   {
	      System.out.println("ENTER ELEMENTS IN MATRIX : ");
	      for(int a = 0; a < rows; a++)
	      {
	         for(int b = 0; b < columns; b++)
	         {
	            num[a][b] = scan.nextInt();
	         }
	      }
	   }
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      System.out.println("NO OF ROWS : ");
	      int row = sc.nextInt();
	      System.out.println("NO OF COLUMNS : ");
	      int col = sc.nextInt();
	      Asg7 asg = new Asg7();
	
	      int[][] numbers = new int[row][col];
	      
	      Matrix(sc, numbers, row, col);
	      asg.SumDiagonal(numbers, 3);
	

	}

}
