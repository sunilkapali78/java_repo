package services;

import java.sql.ResultSet;

import Domain.User;
import dbaccess.Database;

public class UserService {

	Database db= null;
	public UserService()
	{
		db= new Database();
	}
	
	public void addUser(User u)
	{
		db.addUser(u);
	}
	
	public ResultSet getusers()
	{
		return db.GetUsers();
	}
	
	public void getuser(int id)
	{
		
	}
}
