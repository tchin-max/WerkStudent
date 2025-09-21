package InterE;

public class CardPayment implements PaymentOption{

	private int CardNumb;
	
	
	public CardPayment(int cardNumb) {
		CardNumb = cardNumb;
	}
	@Override
	public void pay(int amont) {

		System.out.println(amont + "$ payed with Card number: " + CardNumb );
		
	}
public int getCardNumb() {
	return CardNumb;
}
}
