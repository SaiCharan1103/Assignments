package q3;

public class check {

		public static void main(String[] args) {
			 
			bankt newbankt = new bankt();
			newbankt.showTotal();
			
			bankt savingAc = new savingsaccount();
			
			bankt current = new currentaccount();
			
			savingAc.addAmt(1000);
			current.addAmt(20000);
			
			bankt bankt = new bankt();
			bankt.addToTotalBankCash(current);
			bankt.addToTotalBankCash(savingAc);
			
			current.showTotal();
			savingAc.showTotal();
			
			newbankt.showTotal();	
		}
}