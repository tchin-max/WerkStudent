package InterA;

import java.util.Objects;

public class ProductImpl implements Product {
private String name;
private int price;


	public ProductImpl(String name, int price) {

		this.name = name;
	this.price = price;
}

	@Override
	public int compareTo(Product t) {

		return Integer.compare(price, t.getPrice());
	}

	@Override
	public int getPrice() {

		return price;
	}

	@Override
	public String toString() {
		return "ProductImpl [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductImpl other = (ProductImpl) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

	
}
