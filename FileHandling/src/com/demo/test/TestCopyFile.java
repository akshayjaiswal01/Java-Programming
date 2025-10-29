package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile {

	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/myfile.txt");
			fos = new FileOutputStream("src/copy.txt", true);
			
			int i = fis.read();
			
			while (i != -1)
			{
				fos.write(i);
				i = fis.read();
			}
			
			System.out.println("File copied succesfully....");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				fis.close();
				fos.close();
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
