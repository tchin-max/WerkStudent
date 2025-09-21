package InterD;

public abstract class CofeeDecorator implements Cofee{

	private Cofee cofee ;
	
	public CofeeDecorator(Cofee cofee) {
		this.cofee = cofee;
	}

	@Override
	public String getDescription() {
	
		return cofee.getDescription();
	}

	@Override
	public double getCoast() {
		return cofee.getCoast();
	}

}
