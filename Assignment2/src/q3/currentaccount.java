package q3;

public class currentaccount extends bankt {
		
		private String name = "Current Account";

		public void showTotal() {
			System.out.println("The Cash Credits of " + name + " is " + totalAmount);
		}

	}