import java.util.Scanner;

public class Test2DArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	 
		System.out.println("Enter the rows of the array");
		int row = sc.nextInt();
		
		System.out.println("Enter the columns of the array");
		int col = sc.nextInt();
		
		int [][] arr = new int[row][col];
		int [][] arr1 = new int[row][col];
		
		System.out.println("Enter array1 Data");
		Array2DServices.acceptData(arr);
		
		System.out.println("Enter array2 Data");
		Array2DServices.acceptData(arr1);
		
		System.out.println("Array 1 is ");
		Array2DServices.displayData(arr);
		
		System.out.println("Array 2 is ");
		Array2DServices.displayData(arr1);
		
		int choice = 0;
		do {
			
			System.out.println("1. Add all number \n"
							 + "2. Add row wise \n"
							 + "3. Add column wise \n"
							 + "4. Find Max of All numbers \n"
							 + "5. Find Min of All numbers \n"
							 + "6. Find Maximum row wise \n"
							 + "7. Find Maximum column wise \n"
							 + "8. Addition of 2 matrix \n"
							 + "9. Multiplication of 2 matrix \n"
							 + "10. Transpose of matrix \n"
							 + "11. Check Identity of matrix \n"
							 + "12. Rotate right to the Matrix row \n"
							 + "13. Rotate right to the matrix col \n"
							 + "14. Convert 2D array into 1D array \n"
							 + "15. Exit");
			
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				int ans = Array2DServices.addAllNo(arr);
				System.out.println("Sum of 2D array is: "+ans);
				break;
				
			case 2:
				int [] addRow = Array2DServices.addRowWise(arr);
				Array2DServices.display1DArray(addRow);
				break;
				
			case 3:
				int [] addCol = Array2DServices.addColWise(arr);
				Array2DServices.display1DArray(addCol);
				break;
				
			case 4:
				int max = Array2DServices.findMaxIn2DArray(arr);
				System.out.println("Maximum Number in 2D Array is: "+max);
				break;
				
			case 5:
				int min = Array2DServices.findMinIn2DArray(arr);
				System.out.println("Minimun number iin 2D array is :"+min);
				break;
				
			case 6:
				int [] maxRow = Array2DServices.findMaxInRowWise(arr);
				Array2DServices.display1DArray(maxRow);
				break;
				
			case 7:
				int [] maxCol = Array2DServices.findMaxInColWise(arr);
				Array2DServices.display1DArray(maxCol);
				break;
				
			case 8:
				int [][] addArr = Array2DServices.add2DArray(arr,arr1);
				Array2DServices.displayData(addArr);
				break;
				
			case 9:
				int [][] multiplyArr = Array2DServices.multiply2DArray(arr,arr1);
				Array2DServices.displayData(multiplyArr);
				break;
				
			case 10:
				int[][] transposeArr = Array2DServices.transpose2DArray(arr,arr1);
				Array2DServices.displayData(transposeArr);
				break;
	
				
			}
			
			
		}
		while(choice != 14);
		
		
		
		
			 

	}

}
