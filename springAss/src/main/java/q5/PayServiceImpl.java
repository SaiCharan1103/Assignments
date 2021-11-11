package q5;

public class PayServiceImpl {
	@Resource(name="cashPaymentBean")
	 private IPayment payment;
	 
	 public void performPayment() {
	  payment.executePayment();
	 }
	 
	 public IPayment getPayment() {
	  return payment;
	 }
	 public void setPayment(IPayment payment) {
	  this.payment = payment;
	 }

}
