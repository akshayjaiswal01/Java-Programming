package com.demo.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestWriteFile {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		
		FileOutputStream fos = null;
		
		try {
			
			System.out.println("Enter Text: ");
			String content = sc.nextLine();
			
			fos = new FileOutputStream("src/myfile.txt", true);
			
			fos.write(content.getBytes());
			
			System.out.println("File write successfully...");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fos.close();
				sc.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
