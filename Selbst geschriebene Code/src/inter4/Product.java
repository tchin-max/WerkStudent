package inter4;

public class Product {
	
	private String name;
	private double price;
	private double taxRate;
	public  Product(String name,double price,double taxRate) {
	
		this.name=name;
		this.price=price;
		this.taxRate=taxRate;
	
						
	}
	
	public double getpriceWithtaxes() {
		
	double Bruttopreis = price*(taxRate/100) ;
	return Math.round((Bruttopreis+price)*100.0)/100.0;
				
	}
	public double getpriceWithouttaxes() {
		
		return price;
		
	}
	public String  toString() {
	
return String.format("%-25s %11.2f Euro",name+":",getpriceWithtaxes() );		
		
		
		
		

		
	}
	
}
