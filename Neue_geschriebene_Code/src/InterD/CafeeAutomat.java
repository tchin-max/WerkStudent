package InterD;

public class CafeeAutomat {
	public static void main(String[] args) {
		Cofee cofee = new SimpleCofee();
		
		System.out.println(cofee.getDescription() + cofee.getCoast());
		
		cofee  = new MilchDecorator(cofee);
		cofee = new SugarDecorator(cofee);
		
		System.out.println(cofee.getDescription() + cofee.getCoast());
	}

}
