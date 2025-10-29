package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.demo.exception.WrongNumberException;

public class TestNumberGuesser {

	public static void main(String[] args) 
	{
		int num = 77;
		Scanner sc =new Scanner(System.in);
		while(true)
		{
			try 
			{
				System.out.println("Guess anumber");
				int num1 =sc.nextInt();
					if(num1 == num)
					{
						System.out.println("you guess a correct number");
						break;
					}
					else if(num1>num)
					{
						throw new WrongNumberException(" ohhhh!! it is a smaller number ");
					}
					else
					{
						throw new WrongNumberException("ohhhh!! it is a greater number");
					}
			} 
			catch(WrongNumberException e)
			{
				System.out.println(e.getMessage());
			}
			catch (InputMismatchException e) 
			{
				System.err.println("please enter a number!!");
				sc.next();
			}
		}

	}

}
