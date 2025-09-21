package InterC;

public class concreatecretorA extends Creator {

	@Override
	public Product createProduct() {
		return new concreateProductA();
	}

}
