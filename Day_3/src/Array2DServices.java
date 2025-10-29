import java.util.Scanner;

public class Array2DServices 
{

	public static void acceptData(int[][] arr) 
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("Enter row: "+i+" and col: "+j);
				arr[i][j] = sc.nextInt();
			}
		}
		
	}

	public static void displayData(int[][] arr) 
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static void display1DArray(int[] arr) 
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
	}

	public static int addAllNo(int[][] arr) 
	{
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				sum = sum + arr[i][j];
			}
		}
		return sum;
	}

	public static int[] addRowWise(int[][] arr) 
	{
		int temp [] = new int [arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			temp[i] = 0;
			for(int j=0; j<arr[i].length; j++)
			{
				temp[i] = temp[i] + arr[i][j];
			}
			
		}
		return temp;
	}

	public static int[] addColWise(int[][] arr) {
		int [] temp = new int[arr[0].length];
		
		for(int i=0; i<arr.length; i++)
		{
			temp[i] = 0;
			for(int j=0; j<arr[i].length; j++)
			{
				temp[i] = temp[i] + arr[j][i];
			}
		}
		
		return temp;
	}

	public static int findMaxIn2DArray(int[][] arr)
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

	public static int findMinIn2DArray(int[][] arr) {
		int min = Integer.MAX_VALUE;
		for(int i=0 ;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
		}
		return min;
	
	}
	
	public static int[] findMaxInRowWise(int[][] arr) 
	{
		int maxArr [] = new int [arr.length];
		
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
			maxArr[i] = max;
		}
		return maxArr;
	}

	public static int[] findMaxInColWise(int[][] arr) 
	{
		int maxArr[] = new int [arr[0].length];
		
		for(int i=0; i<arr.length; i++)
		{
			int max = Integer.MIN_VALUE;
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[j][i] > max)
				{
					max = arr[j][i];
				}
			}
			maxArr[i] = max;
		}
		return maxArr;
	}

	public static int[][] add2DArray(int[][] arr, int[][] arr1) {
		int[][] temp =new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				temp [i][j]=arr[i][j]+arr1[i][j];
			}
		}
		return temp;
	}

	public static int[][] multiply2DArray(int[][] arr, int[][] arr1) {
		int[][] temp = new int[arr.length][arr[0].length];
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k =0 ; k< arr[i].length ;k++) {
					temp[i][j]+=arr[i][k]*arr[k][j];
				}
			}
		}
		return temp;
	}

	public static int[][] transpose2DArray(int[][] arr, int[][] arr1) {
		int[][]temp = new int[arr.length][arr[0].length];
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				temp[i][j] = arr[j][i];
			}
		}
		return temp;
	}

	
}
