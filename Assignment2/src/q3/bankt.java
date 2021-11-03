package q3;

public class bankt {
		private String name = "Bank"; 
		int totalAmount;
		
		public void addToTotalBankCash(bankt obj) {
			totalAmount += obj.totalAmount;
		}
		
		public void showTotal() {
			System.out.println("The total cash in " + name + " is " + totalAmount);
		}
		
		public void addAmt(int amt) {
			totalAmount +=  amt ;
		}

	}

