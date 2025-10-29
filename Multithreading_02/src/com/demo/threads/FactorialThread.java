package com.demo.threads;

import com.demo.beans.MyClass;

public class FactorialThread extends Thread
{
	private int n;
	private MyClass obj;
	
	
	public FactorialThread(int n, MyClass obj) {
		super();
		this.n = n;
		this.obj = obj;
	}
	
	public void run()
	{
		int ans = obj.factorial(n);
		System.out.println("Factorial of "+n+": "+ans);
	}
	
	
}