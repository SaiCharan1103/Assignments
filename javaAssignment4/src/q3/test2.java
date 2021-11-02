package q3;

public class test2 {
	public static void main(String[] args)
	{
		try {
			savingaccount jimmysSavings = new savingaccount(2000);
			
			jimmysSavings.withdraw(2100);
			System.out.println(jimmysSavings.getBalance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("IllegalBankTransactionException");

}

}
