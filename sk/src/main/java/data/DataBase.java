package data;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	return false;
	
}
public ResultSet GetCustomers() throws SQLException {

	String sql = "select * from login";
	 
	
	try {
		Statement s= connection.createStatement();
		ResultSet rs= s.executeQuery(sql);
		return rs;
		 
		
	} catch (SQLException e) {
		
		throw e;
	}
	
}
}
