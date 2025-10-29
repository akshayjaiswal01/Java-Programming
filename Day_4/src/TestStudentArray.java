import java.util.Scanner;

public class TestStudentArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("1. add new student\n2. display all\n3. search by id");
			System.out.println("4. search by name\n5. update marks\n6.exit");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				boolean status = StudentService.addNewStudent();
				if(status)
				{
					System.out.println("Student Added Successfuly");
				}
				else
				{
					System.out.println("Failed to add!!!");
				}
				break;
				
			case 2:
				StudentService.displayAll();
				break;
			}
		}
		while(choice != 6);
		
	}

}
