package inter4;

public class ShoppingBasket {
	
	private  Product[] products;
	
	public ShoppingBasket() {
		
		this.products=  new Product[10];
		
	}
	
	public void add(Product product) {
		
		int index = 0;
		while(index< products.length  && products[index]!= null) {//pruft dass dort noch kein Produkt gespeichert wurde
			
			index++;
		}
		
		if(index == products.length) {
			
			Product[] newprodukt = new Product[(int) (products.length*Math.random()*5)];
			for(int i=0;i<products.length;i++) {
				
				newprodukt [i] = products[i];	
			}
			
			products= newprodukt;
			products[index] = product;
		}else {
			products[index] = product;

		}
	}
	
	public double getpriceWithtaxes() {
		
		double totalsumme =0;
		for(int i=0;i<products.length;i++) {
			if(products[i]!=null) {
				totalsumme += products[i].getpriceWithtaxes() ;
				
			}
			
			
		}
		return totalsumme;
	}
	
	public double getpriceWithouttaxes() {
		
		double totalsumme =0;
		for(int i=0;i<products.length;i++) {
			if(products[i]!=null) {// muss ab weichend von null sein, sonstkann man keine summe verichten.
				totalsumme += products[i].getpriceWithouttaxes() ;
	}
		}
		return totalsumme;
		}
	
	public String toString () {
		String result ="";
		for(int i=0;i<products.length;i++) {
			if(products[i]!=null) {
				result+= products[i].toString()+"\n";
			}
		}
		 result += "==========================================\n";
		 result+= String.format("Gesamtsumme  mit Steuern: %11.2f Euro\n", getpriceWithtaxes() );
		 result+= String.format("Gesamtsumme ohne Steuern: %11.2f Euro\n",getpriceWithouttaxes () );
		 result+= String.format("Steuern gesamt:           %11.2f Euro\n", getpriceWithtaxes() - getpriceWithouttaxes () );
		 
		 return result;
		
	}

}
