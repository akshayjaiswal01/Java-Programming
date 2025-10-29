import java.util.Scanner;

public class MainApp 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("1. Add new Test \n"
							 + "2. Display Test \n"
							 + "3. Exit" );
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
		
			switch(choice)
			{
			case 1:
					boolean status = TestServices.addNewTest();
					if(status)
					{
						System.out.println("Test added successfully...");
					}
					else
					{
						System.out.println("Failed to add!!!");
					}
				break;
				
			case 2:
				TestServices.displayAllTest();
				break;
				
			case 3:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Input!!!");
			}
			
		}
		while(choice !=3);

	}

}
