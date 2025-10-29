import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome");
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		ArrayServices.acceptData(arr);
		ArrayServices.displayData(arr);
		
		int choice = 0;
		
		do {
			System.out.println("Menue");
			System.out.println("1. Search a number \n"
							 + "2. Find Maximum Number \n"
							 + "3. Find Minimum Number \n"
							 + "4. Addition of All Numbers in Array \n"
							 + "5. Find All Occurrences of number \n"
							 + "6. Find nth Maximum number \n"
							 + "7. Find nth Minimum number \n"
							 + "8. Exit");
			
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter a number you want to search");
				int num = sc.nextInt();
				
				int search = ArrayServices.searchNumber(arr, num);
				
				if(search != -1)
				{
					System.out.println("Number found at index: "+search);
				}
				else
				{
					System.out.println("Number not found");
				}
				
				break;
				
			case 2:
				int max = ArrayServices.findMaxNum(arr);
				System.out.println("Maximum number in array is: "+max);
				break;
				
			case 3:
				int min = ArrayServices.findMinNum(arr);
				System.out.println("Minimum number in array is: "+min);
				break;
				
			case 4:
				int add = ArrayServices.addAllElemeOfArray(arr);
				System.out.println("Addition of Array is: "+add);
				break;
				
			case 5:
				System.out.println("Enter Number: ");
				int num1 = sc.nextInt();
				
				int [] occurrence = ArrayServices.findAllOccurrences(arr, num1);
				
				if(occurrence != null)
				{
					System.out.println("All Positions are: ");
					ArrayServices.displayData(occurrence);
				}
				else
				{
					System.out.println("Not Found");
				}
				break;
			
			case 6:
				System.out.println("Enter Number: ");
				int num3 = sc.nextInt();
				int nthMax = ArrayServices.findNthMax(arr, num3);
				System.out.println("nth Maximum number is: "+nthMax);
				break;
			
			case 7:
				break;
				
			case 8:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice...");
			 
			}
		}
		while(choice <= 8);
		
		

	}

}
