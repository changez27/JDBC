import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User", "root", "123456");
			Statement st=con.createStatement();
			System.out.println("Enter Username to Delete Data:");
			String username=sc.next();
			int x=st.executeUpdate("delete from info where username='"+username+"'");
			if(x!=0)
			{
				System.out.println("**********Data Deleted**********");
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
