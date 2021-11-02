package q3;

public class savingaccount {
		private double balance;

		public savingaccount(int i) {
			// TODO Auto-generated constructor stub
		}

		public void SavingsAccount()
		{
			balance = 0;
		}

		public void SavingsAccount(double initialBalance)
		{
			balance = initialBalance;
		}

		public void deposit(double amount)
		{
			balance = balance + amount;
		}

		public void withdraw(double amount)
		{
			balance = balance - amount;
		}
		public double getBalance()
		{
			return balance;
		}

	}

