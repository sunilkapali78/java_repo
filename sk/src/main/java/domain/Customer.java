package domain;

public class Customer {
int id;
String name;
String Password;
public String getPassword() {
	return Password;
}
public void setPassword(String password) throws Exception {
	if(password.length()<3)
	{
		throw new Exception("What the hell is that password");
	}
	Password = password;
}
public int getId() {
	return id;
}
public Customer(int id, String name, String password) {
	super();
	this.id = id;
	this.name = name;
	Password = password;
}
public Customer() {
	// TODO Auto-generated constructor stub
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) throws Exception {
	if(name.length()<1)
	{
		throw new Exception("What the hell is that name");
	}
	this.name = name;
}

}
