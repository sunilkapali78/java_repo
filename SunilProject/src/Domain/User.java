package Domain;

public class User {

	public int UserId;
	public String Name;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public User(int userId, String name) {
		super();
		UserId = userId;
		Name = name;
	}
	public User() {
		super();
		System.out.print("object created");
	}
	
	
	
}
