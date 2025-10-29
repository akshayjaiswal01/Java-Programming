import java.util.Scanner;
public class TestArray2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		ArrayServices2.acceptData(arr);
		ArrayServices2.displayData(arr);
		
		int choice = 0;
		
		do 
		{
			System.out.println("Menu");
			System.out.println("1. Display All Prime number \n"
							  +"2. Addition of digits of odd numbers \n"
							  +"3. Factorial of all numbers which are less than 7 \n"
							  +"4. Find nth Maximum Prime number \n"
							  +"5. Find nth Minimum Prime Number \n"
							  +"6. Exit");
			
			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("All Prime number are: ");
				ArrayServices2.displayAllPrimeNo(arr);
				break;
				
			case 2:
				System.out.println("Addition of Digits of odd numbers: ");
				int [] temp = ArrayServices2.additionOfDigitsOfOddNo(arr);
				ArrayServices2.displayData(temp);
				break;
				
			case 3:
				System.out.println("Factorial of all numbers which are less than 7");
				int temp1 [] = ArrayServices2.findFactorial(arr);
				ArrayServices2.displayData(temp1);
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
			case 6:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Choice");
				
			}
					
		}
		while(choice<=6);
		
		
	}

}
