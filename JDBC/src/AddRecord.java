import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class AddRecord {
		
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User", "root", "123456");
			Statement st=con.createStatement();
			System.out.println("Enter Username:");
			String username=sc.next();
			System.out.println("Enter Password:");
			String password=sc.next();
			int x=st.executeUpdate("insert into info values('"+username+"','"+password+"')");
			if(x!=0)
			{	
				System.out.println("**********Data Inserted**********");
			}
			else
			{
				System.out.println("**********Data not Inserted**********");
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
