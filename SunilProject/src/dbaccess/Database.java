package dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Domain.User;


public class Database {

	public Database() {
		
	}
	
	Connection connection=null;
// db connection
	public Connection GetConnection()
	{
		
		try {
		
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		                 //jdbc:mysql://localhost:3306/sonoo 
		String jdbcURL = "jdbc:mysql://localhost:3306/evan";

	     connection = DriverManager.getConnection(jdbcURL,"mysqluser","mysqlpassword"); //""
	 	//System.out.println(connection.isClosed());
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	
		return connection;
		
		
	}
	
	public void addUser(User u)
	{
        GetConnection();
		
		String query="insert into user (name) values(?)";
		try
		{
		PreparedStatement s= connection.prepareStatement(query);
	    s.setString(1, u.Name);
	    int r=s.executeUpdate();
	    
	    System.out.println(r);
	    
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	public ResultSet GetUsers()
	{
		GetConnection();
		
		//String query="select * from user";
		try
		{
		Statement s= connection.createStatement();
	    ResultSet rs=	s.executeQuery("select * from user");
	    return rs;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return null;
		
	}
	
	

}
