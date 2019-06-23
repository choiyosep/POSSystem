package POSSystem;

import java.util.HashMap;

public class ClientList {
	
    private static HashMap<String, Integer> clientsList = new HashMap<>();

    private static ClientList instance = new ClientList();

    public static ClientList getInstance() {
        return instance;
    }
    
    public HashMap<String, Integer> getList() {
        return clientsList;
    }
    
    public boolean isClient(String phoneNumber) {
    	if(clientsList.containsKey(phoneNumber)) {
    		return true;
        }
    	return false;
    }
    
    public void InsertPair(String phoneNumber, int point) {
        if(!isClient(phoneNumber)) {
        	clientsList.put(phoneNumber, point);
        }
    }
   
   

}