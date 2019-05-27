package POSSystem;

import java.util.ArrayList;

public class UserInterfaceList {
	private static ArrayList<UserInterface> userInterfaceList = new ArrayList<UserInterface>();

	public void update(UserInterface userInterface) {
		userInterfaceList.set(userInterface.getUserId(), userInterface);
	}

}
