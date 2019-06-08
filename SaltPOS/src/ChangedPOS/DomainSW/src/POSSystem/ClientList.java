package POSSystem;

import java.util.ArrayList;

class ClientList {

    private ArrayList<Client> clientsList = new ArrayList<>();

    private static ClientList instance = new ClientList();

    public static ClientList getInstance() {
        return instance;
    }

    public ArrayList<Client> getList() {
        return clientsList;
    }

    public Client enterClientInfo(String phone_number) {
        for(Client client : clientsList) {
            if(client.getphoneNumber().equals(phone_number)) {
                return client;
            }
        }
        return null;
    }

}