package POSSystem;

public class UserInterface {

	private int userId;
	private String userInterface = new String("basic");
	
	UserInterface(int userId)
	{
		this.setUserId(userId);
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserInterface() {
		return userInterface;
	}

	public void setUserInterface(String userInterface) {
		this.userInterface = userInterface;
	}
	
}
