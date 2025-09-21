package InterD;

public class SugarDecorator extends CofeeDecorator {

	public SugarDecorator(Cofee cofee) {
		super(cofee);

	}

	@Override
	public String getDescription() {
		
		return super.getDescription() + ", Sugar";
	}
	@Override
	public double getCoast() {
		
		return super.getCoast() + 0.30;
	}
}
