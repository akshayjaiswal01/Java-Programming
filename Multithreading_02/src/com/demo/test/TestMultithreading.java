package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.threads.CheckPrimeThread;
import com.demo.threads.FactorialThread;
import com.demo.threads.PrintTableThread;

public class TestMultithreading 
{

	public static void main(String[] args)
	{
		MyClass obj = new MyClass();
		
		FactorialThread th1 = new FactorialThread(5, obj);
		th1.start();
		
		CheckPrimeThread pth = new CheckPrimeThread(7, obj);
		pth.start();
		
		PrintTableThread tth = new PrintTableThread(3, obj);
		tth.start();
		
		PrintTableThread tth1 = new PrintTableThread(7, obj);
		tth1.start();

	}

}
