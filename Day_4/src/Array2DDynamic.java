import java.util.Scanner;
public class Array2DDynamic {

	public static void acceptData(int[][] arr) 
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter no of columns for row: "+i);
			int col = sc.nextInt();
			
			arr[i] = new int[col];
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("Enter value for "+i+","+j+" ");
				arr[i][j] = sc.nextInt();
			}
		}
		
	}

	public static void displayData(int[][] arr) 
	{
		System.out.println("Your array is: ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

	public static int findMaxOfAll(int[][] arr) 
	{
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	public static int[] findMaxRowWise(int[][] arr) 
	{
		int temp [] = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			int max = Integer.MIN_VALUE;
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}
			}
			temp[i] = max;
		}
		return temp;
	}

	public static int[] findMaxColWise(int[][] arr) 
	{
		int maxLength = arr[0].length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].length > maxLength)
			{
				maxLength = arr[i].length;
			}
		}
		
		int temp [] = new int[maxLength];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] > temp[j])
				{
					temp[j] = arr[i][j];
				}
			}
		}
		return temp;
	}

}
