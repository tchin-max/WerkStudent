package InterC;

public abstract class Creator {

	public Product create() {
 Product p = createProduct();
 p.built();
 return p;
		
	}
	protected abstract Product createProduct() ;
}
