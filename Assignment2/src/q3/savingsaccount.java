package q3;

public class savingsaccount extends bankt {
	 
	private String name = "Saving Account";
	
	public void showTotal() {
		System.out.println("Your Fixed Deposits " + name + " balnce is " + totalAmount);
	}

}