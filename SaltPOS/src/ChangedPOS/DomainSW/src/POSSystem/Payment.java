package POSSystem;

public abstract class Payment {
	
	public abstract String getName();
	public abstract void showChange(int cash, int total);
	public abstract void showResult(String info, int total);

}