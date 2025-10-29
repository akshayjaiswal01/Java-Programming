import java.util.Scanner;

public class ArrayServices2 
{
	public static void acceptData(int [] arr)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of array");
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter "+i+"th element");
            arr[i] = sc.nextInt();
        }
    }

    public static void displayData(int [] arr)
    {
        System.out.println("Your Array is: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(i+": "+arr[i]);
        }
    }
    
    public static void displayAllPrimeNo(int [] arr)
    {
    	for(int i=0; i<arr.length; i++)
    	{
    		boolean isprime = false;
    		isprime = isPrime(arr[i]);
    		if(isprime)
    		{
    			System.out.print(arr[i]+"\t");
    		}
    	}
    	System.out.println();
    }

	private static boolean isPrime(int num) 
	{
		if(num <= 1)
		{
			return false;
		}
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
		
	}
	
	
	public static int [] additionOfDigitsOfOddNo(int [] arr)
	{
		int temp [] = new int[arr.length];
    	for(int i=0; i<temp.length; i++)
    	{
    		temp[i] = arr[i];
    	}
    	
		
		for(int i=0; i<temp.length; i++)
		{
			if(temp[i] % 2 != 0)
			{
				int sum = 0;
				while(temp[i] != 0)
				{
					int rem = temp[i] % 10;
					sum = sum + rem;
					temp[i] = temp[i] / 10;
				}
				temp[i] = sum;
			}
		}
		return temp;
	}
	
	public static int [] findFactorial(int [] arr)
	{
		
		int temp [] = new int[arr.length];
    	for(int i=0; i<temp.length; i++)
    	{
    		temp[i] = -1;
    	}
    	
		for(int i=0; i<temp.length; i++)
		{
			if(temp[i] < 7)
			{
				int fact = 1;
				for(int j=1; j<=temp[i]; j++)
				{
					fact = fact * j;
				}
				temp[i] = fact;
			}
		}
		return temp;
	}
}
