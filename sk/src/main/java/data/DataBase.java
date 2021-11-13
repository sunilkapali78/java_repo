package data;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Customer;
public class DataBase {
	Connection connection=null;

	public DataBase() {
		super();
		GetConnection();
	}

public Connection GetConnection()
{
	
	try {
	
		
	Class.forName(data.Config.DRIVER);
	
	String jdbcURL = data.Config.URL;

     connection = DriverManager.getConnection(jdbcURL, data.Config.MYSQLUSER, data.Config.MYSQLPASSWORD);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
	
	
}

public Boolean AddCustomer(Customer customer) throws SQLException {
	
	if(connection.isClosed())
	{
	connection=	GetConnection();
	}

	String sql = "INSERT INTO login (name, password) VALUES (?, ?)";
	 
	
	try {
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, customer.getName());
		statement.setString(2, customer.getPassword());
		
		 
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("A new user was inserted successfully!");
		    return true;
		}
	} catch (SQLException e) {
		
		throw e;
	}
	finally {
		connection.close();
	}
	return false;
	
}
public List<Customer> GetCustomers() throws Exception {

	ResultSet rs=null;
	if(connection.isClosed())
	{
	connection=	GetConnection();
	}

	String sql = "select * from login";
	 
	
	try {
		Statement s= connection.createStatement();
		rs= s.executeQuery(sql);
	
		List<Customer> customers= new ArrayList<Customer>(); 	
			
			while(rs.next())
			{
				Customer c= new Customer();
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setPassword(rs.getString("password"));				
				customers.add(c);
				//customers.add(new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("password")));
			}
			return customers;
		
	} catch (Exception e) {
		
		throw e;
	}
	finally {
		if(rs!=null)
		{
			rs.close();
		}
		if(connection!=null)
		{
		connection.close();
		}
	}
	
}
}
