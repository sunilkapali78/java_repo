package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import data.DataBase;
import domain.Customer;

public class CustomerService {
	DataBase db;
	
public CustomerService() {
		super();
		
		this.db= new DataBase();
	}

public Boolean AddCustomer(Customer customer) throws SQLException
{
	
	try {
		if(db.AddCustomer(customer))
		{
			return true;
		}
		
	} catch (SQLException e) {
		throw e;
	}
	return false;
}
public List<Customer> GetCustomers(){
	List<Customer> customers= new ArrayList<Customer>(); 
	
	try {
		customers=db.GetCustomers();
		return customers;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	
}
}
