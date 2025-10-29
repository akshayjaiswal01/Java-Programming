package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
			try {
				System.out.println("Enter Number1: ");
				int num1 = sc.nextInt();
				
				System.out.println("Enter Number2: ");
				int num2 = sc.nextInt();
				
				int ans = num1 / num2;
				
				System.out.println("Result: "+ans);
			}
			catch(InputMismatchException e) {
				System.err.println("Please Enter a number");
			}
			catch(ArithmeticException e){
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			finally{
				System.out.println("Program Terminated");
			}

	}

}
