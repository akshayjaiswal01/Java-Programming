import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no rows: ");
		int rows = sc.nextInt();
		
		int [][] arr = new int[rows][];
		
		Array2DDynamic.acceptData(arr);
		Array2DDynamic.displayData(arr);
		
		int choice = 0;
		
		do {
			System.out.println("1. find max of all data\n2. find max rowwise");
			System.out.println("3. find max column wise\n4. find addition rowwise");
	        System.out.println("5. find addition columnwise");
	        
	        System.out.println("Enter your Choice");
	        choice = sc.nextInt();
	        
	        switch(choice)
	        {
	        case 1:
	        	int max = Array2DDynamic.findMaxOfAll(arr);
	        	System.out.println("Maximum number is: "+max);
	        	break;
	        	
	        case 2:
	        	int [] maximum = Array2DDynamic.findMaxRowWise(arr);
	        	for(int i=0; i<maximum.length; i++)
	        	{
	        		System.out.println("Max: "+maximum[i]);
	        	}
	        	break;
	        	
	        case 3:
	        	int [] maximum1 = Array2DDynamic.findMaxColWise(arr);
	        	for(int i=0; i<maximum1.length; i++)
	        	{
	        		System.out.println("Max: "+maximum1[i]);
	        	}
	        	break;
	        }
		}
		while(choice != 6);
		
		
		System.out.println("");
		
	}

}
