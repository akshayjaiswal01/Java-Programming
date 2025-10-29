import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentService 
{
	static  Student[] stdArr;
	static int count = 0;
	
	static {
		stdArr = new Student[100];
	}
	
	public static boolean addNewStudent() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Marks1: ");
		float marks1 = sc.nextFloat();
		
		System.out.println("Enter Marks2: ");
		float marks2 = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Enter Date of Birth (dd/mm/yyyy)");
		String date = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date bdate = null;
		
		try {
			bdate = sdf.parse(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		Student std = new Student(id, name, marks1, marks2, bdate);
		if(stdArr.length == count)
		{
			return false;
		}
		else
		{
			stdArr[count] = std;
			count++;
			return true;
		}
	}

	public static void displayAll() 
	{
		for(int i=0; i<count; i++)
		{
			System.out.println(stdArr[i]);
		}
		
	}
	
	
}
