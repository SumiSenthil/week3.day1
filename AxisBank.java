package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Axis Bank : Deposit Overrided from Bank Info");
		}
	

	public static void main(String[] args) {
		 AxisBank obj = new AxisBank();
		 obj.deposit();

	}

}
