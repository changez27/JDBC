import java.util.Scanner;

public class Menu {
		
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int operation;
		char c='y';
		System.out.println("**********MENU**********");
		System.out.println("1. AddRecord");
		System.out.println("2. SelectRecord");
		System.out.println("3. UpdateRecord");
		System.out.println("4. DeleteRecord");
		System.out.println("5. View Database");
		System.out.println("************************");
		while(c=='y')
		{	
			System.out.println("Select Operation:");
			operation=sc.nextInt();
			switch(operation)
			{
			case 1:
				AddRecord.main(args);
				break;
				
			case 2:
				SelectRecord.main(args);
				break;
				
			case 3:
				UpdateRecord.main(args);
				break;
				
			case 4:
				DeleteRecord.main(args);
				break;
				
			case 5:
				ViewDatabase.main(args);
				break;
				
			default:
				System.out.println("Invalid Input");
			
			}
			System.out.println("Continue...(y/n)");
			c=sc.next().charAt(0);
		}
		sc.close();
	}
}
