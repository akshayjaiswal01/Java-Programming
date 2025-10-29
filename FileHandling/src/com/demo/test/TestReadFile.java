package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestReadFile {

	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src/myfile.txt");
			int i = fis.read();
			
			while(i != -1)
			{
				System.out.print((char)i);
				i = fis.read();
			}
			System.out.println();
			
			System.out.println("File read successfully....");
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				
				System.out.println(e.getMessage());
			}
		}

	}

}
