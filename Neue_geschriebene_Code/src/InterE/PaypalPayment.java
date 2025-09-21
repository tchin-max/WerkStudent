package InterE;

public class PaypalPayment implements PaymentOption {

	private String email;
		
	public PaypalPayment(String email) {
		this.email = email;
	}


	@Override
	public void pay(int amont) {

		System.out.println(amont + "$ pay with the email: " + email);
		
	}
	public String getEmail() {
		return email;
	}

}
