package q3;

public class test {
		public static void main(String[] args)
		{
			try {
				savingaccount jimmysSavings = new savingaccount(2000);
				jimmysSavings.withdraw(2100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("InsufficientBalanceException");

}
}