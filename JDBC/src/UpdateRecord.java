import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {

	public static void main(String args[])
	{
		int x=0;
		Scanner sc = new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User", "root", "123456");
			Statement st=con.createStatement();
			System.out.println("1. Update Username");
			System.out.println("2. Update Password");
			int operation;
			System.out.println("Select Operation:");
			operation=sc.nextInt();
			System.out.println("Enter Username to Update Data:");
			String username=sc.next();
			switch(operation)
			{
			case 1:
				x=st.executeUpdate("update info set username='"+username+"' where username='"+username+"'");
				break;
				
			case 2:
				System.out.println("Enter New Password:");
				String password=sc.next();
				x=st.executeUpdate("update info set password='"+password+"' where username='"+username+"'");
				break;
				
			default:
				System.out.println("**********Invalid Username**********");
			}
			if(x!=0)
			{
				System.out.println("**********Data Updated**********");
			}	
			else
			{
				System.out.println("**********Invalid Username**********");
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
