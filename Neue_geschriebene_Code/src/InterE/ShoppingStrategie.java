package InterE;

public class ShoppingStrategie {
	protected PaymentOption po ;

	
	public void setPo(PaymentOption po) {
		this.po = po;
	}
public void checkout(int amont) {

	if (po==null) {
		
		throw new IllegalArgumentException("Payment Option not choosed");
	}
	po.pay(amont);

}

	}
	


