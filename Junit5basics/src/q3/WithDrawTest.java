package q3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WithDrawTest {
	@Test
	void test() {
		 
		BankAccount demoAccount = new BankAccount();
		String exception ="";
		try {
			demoAccount.withDraw(10000);
		} catch (Exception e) {
			  exception = e.toString();	
		}
		
		assertEquals(exception, "Junit3.InSufficientBalanceException");
			 
	}

}
