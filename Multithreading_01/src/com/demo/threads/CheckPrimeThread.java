package com.demo.threads;

import com.demo.beans.MyClass;

public class CheckPrimeThread implements Runnable 
{
	private int n;
	private MyClass obj;
	
	

	public CheckPrimeThread(int n, MyClass obj) {
		super();
		this.n = n;
		this.obj = obj;
	}



	@Override
	public void run() 
	{
		boolean ans = obj.checkPrime(n);
		if(ans)
		{
			System.out.println(n+ " is prime number");
		}
		else
		{
			System.out.println(n+ " is not prime number");
		}

	}

}
