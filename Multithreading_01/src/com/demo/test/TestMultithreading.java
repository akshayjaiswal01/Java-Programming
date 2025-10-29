package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.threads.CheckPrimeThread;
import com.demo.threads.FactorialThread;
import com.demo.threads.PrintTableThread;

public class TestMultithreading {

	public static void main(String[] args) 
	{
		MyClass obj = new MyClass();
		
		FactorialThread fth = new FactorialThread(5, obj);
		Thread th = new Thread(fth);
		th.start();
		
		CheckPrimeThread pth = new CheckPrimeThread(7, obj);
		Thread th1 = new Thread(pth);
		th1.start();
		
		PrintTableThread tth = new PrintTableThread(3, obj);
		Thread th2 = new Thread(tth);
		th2.start();
		
		PrintTableThread tth1 = new PrintTableThread(7, obj);
		Thread th3 = new Thread(tth1);
		th3.start();

	}

}
