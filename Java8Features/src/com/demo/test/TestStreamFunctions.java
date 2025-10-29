package com.demo.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStreamFunctions {

	public static void main(String[] args) 
	{
		List<Integer>lst = List.of(10,15,77,64,36,88,55);
		
		
		Optional<Integer> max=lst.stream().max(Integer :: compare);
		System.out.println(max);
		
		Optional<Integer>min =lst.stream().min(Integer :: compare);
		System.out.println(min);
		
		max =lst.stream().filter(e ->e %2==0).max(Integer :: compare);
		System.out.println(max.get());
		
		Optional<Integer> op =lst.stream().filter(e ->e>10).findFirst()	;
		if(!op.isEmpty())
		{
			System.out.println(op.get());
		}
		
		List<Integer>lst1=lst.stream().map(e->e*e).collect(Collectors.toList());
		
		List<String>lstr =List.of("Hello","welcome","Test","check");
		Optional<String>op1 = lstr.stream().reduce((acc,s) -> acc.length() > s.length()?acc:s);
		
		boolean status=lst.stream().allMatch(e->{
			System.out.println("in all match "+e);
			return e>15;});
		System.out.println(status);
		
		 status=lst.stream().noneMatch(e ->{
			System.out.println("in none match" +e );
			return e>15;
		 });
		 System.out.println(status);
		 
		 status=lst.stream().anyMatch(e ->{
			 System.out.println("in any match "+e );
			 return e>15;
		 });
		 System.out.println(status);
	}

	
	
}
