package com.demo.threads;

import com.demo.beans.MyClass;

public class PrintTableThread extends Thread
{
	private int n;
	private MyClass obj;
	
	
	public PrintTableThread(int n, MyClass obj) {
		super();
		this.n = n;
		this.obj = obj;
	}
	
	public void run()
	{
		obj.printTable(n);
		
	}
}
