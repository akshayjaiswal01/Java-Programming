import java.util.Scanner;

public class ArrayServices
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

    public static int findMaxNum(int [] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMinNum(int [] arr)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    
    public static int[] findAllOccurrences(int [] arr, int num)
    {
        int [] index = new int[arr.length];
        int ind = 0;

        for(int i=0; i<index.length; i++)
        {
            index[i] = -1;
        }

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == num)
            {
                index[ind] = i;
                ind++;
            }
        }

        if(ind > 0)
        {
            return index;
        }

        return null;
    }
    
    public static int addAllElemeOfArray(int [] arr)
    {
    	int sum = 0;
    	
    	for(int i=0; i<arr.length; i++)
    	{
    		sum = sum + arr[i];
    	}
    	return sum;
    }
    
    public static int searchNumber(int [] arr, int num)
    {
    	for(int i=0; i<arr.length; i++)
    	{
    		if(arr[i] == num)
    		{
    			return i;
    		}
    	}
    	return -1;
    }
    
    
    public static int findNthMax(int [] arr, int num)
    {
    	int maxPos;
    	
    	for(int i=0; i<(num-1); i++)
    	{
    		maxPos = findMax(arr);
    		
    		arr[maxPos] = 0;
    	}
    	
    	maxPos = findMax(arr);
    	
    	return arr[maxPos];
    }

	private static int findMax(int [] arr) 
	{
		int maxVal = Integer.MIN_VALUE;
		int maxPos = -1;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > maxVal)
			{
				maxVal = arr[i];
				maxPos = i;
			}
		}
		return maxPos;
		
	}

	
	
	
}
