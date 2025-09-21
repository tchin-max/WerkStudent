package InterD;

public class MilchDecorator extends CofeeDecorator {

	public MilchDecorator(Cofee cofee) {
		super(cofee);

	}
@Override
public String getDescription() {

	return super.getDescription() + ", Mich";
}
@Override
	public double getCoast() {

		return super.getCoast() + 0.5;
	}	

}
