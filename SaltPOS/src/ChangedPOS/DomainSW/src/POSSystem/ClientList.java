package POSSystem;

//import java.util.HashMap;
import java.util.ArrayList;
public class ClientList {
   
    private static ArrayList<Client> clientsList = new ArrayList<>();
    
    private static ClientList instance = new ClientList();

    public static ClientList getInstance() {
        return instance;
    }
    
    public ArrayList<Client> getList() {
        return clientsList;
    }
    
    public Client isClient(String phoneNumber) {
       for(Client client : clientsList) {
          if(client.getphoneNumber().equals(phoneNumber)) {
             return client;
          }
       }
       return null;
    }
    
    public void InsertPair(String phoneNumber, int point) {
       if(isClient(phoneNumber) == null) {
           clientsList.add(new Client(phoneNumber, point));
        }
    }
   
   

}