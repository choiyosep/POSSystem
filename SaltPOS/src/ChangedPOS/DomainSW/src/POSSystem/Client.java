package POSSystem;


public class Client {

    private String phoneNumber;
    private int point = 0;
   
    public Client(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Client(String phoneNumber, int point) {
        this(phoneNumber);
        this.point = point;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(Order order) {
        this.point += order.getTotal() / 100 * 5;
    }
    
    public void subPoint(int point) {
       this.point -= point;
    }
}