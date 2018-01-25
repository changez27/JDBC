import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ViewDatabase {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User", "root", "123456");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from info");
			if(rs.next())
			{
				do
				{
					String username=rs.getString(1);
					String password=rs.getString(2);
					System.out.println("Username: "+username+"     Password: "+password);
				}while(rs.next());
			}	
			else 
			{
				System.out.println("***********Invalid Username**********");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
