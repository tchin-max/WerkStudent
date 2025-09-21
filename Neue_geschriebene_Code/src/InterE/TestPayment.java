package InterE;

public class TestPayment {

	public static void main(String[] args) {
		ShoppingStrategie ss = new ShoppingStrategie();
		
		ss.setPo(new PaypalPayment("thin@gamil.com"));
		ss.checkout(32);
		ss.setPo(new CardPayment(5435));
		ss.checkout(89);
	}
}
