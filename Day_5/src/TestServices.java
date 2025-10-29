import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestServices 
{
	static Test [] tarr = new Test[5];
	static int cnt = 0;

	public static boolean addNewTest() 
	{
		Scanner sc = new Scanner(System.in);
		if(cnt!=5)
		{
			System.out.println("Enter Test Id: ");
			int tid = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Subject Name: ");
			String sub = sc.nextLine();
			
			System.out.println("Enter Date of Test: ");
			String date = sc.nextLine();
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dt = null;
			
			try {
				dt = sdf.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// enter question data
			System.out.println("How many questions in test: ");
			int ques = sc.nextInt();
			
			Question [] qlst = new Question [ques];
			for(int i=0; i<qlst.length; i++)
			{
				System.out.println("Enter "+(i+1)+" Question Data");
				sc.nextLine();
				System.out.println("Enter Question Text: ");
				String qtext = sc.nextLine();
				
				System.out.println("Enter option 1: ");
				String opt1 = sc.nextLine();
				
				System.out.println("Enter option 2: ");
				String opt2 = sc.nextLine();
				
				System.out.println("Enter option 3: ");
				String opt3 = sc.nextLine();
				
				System.out.println("Enter option 4: ");
				String opt4 = sc.nextLine();
				
				System.out.println("Enter answer: ");
				String ans = sc.nextLine();
				
				System.out.println("Enter Marks: ");
				int marks = sc.nextInt();
				
				qlst[i] = new Question((i+1), qtext, opt1, opt2, opt3, opt4, ans, marks);
				
			}
			
			tarr[cnt] = new Test(tid, sub, date, qlst);
			cnt++;
			
			return true;
		}
		
		return false;
	}

	public static void displayAllTest() 
	{
		for(Test t: tarr)
		{
			if(t != null)
			{
				System.out.println(t);
			}
			else
			{
				break;
			}
		}
		
	}
	
}
