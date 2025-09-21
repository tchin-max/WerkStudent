package InterA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductList implements Iterable<Product> {
	private final  Map<Product, Integer> productList = new HashMap<>();

	public void add(Product item) {
		productList.put(item, productList.getOrDefault(item, 0)+1);

	}
	
	@Override
	public Iterator<Product> iterator() {
return productList
		.keySet()
		.stream()
		.sorted(Comparator.comparing(Product::getPrice))
		.iterator();

	
	}

public Iterator<Product> iterator(int minCount){

	return productList.entrySet()
			.stream()
			.filter(t ->t.getValue()>=minCount )
			.map(Map.Entry::getKey)
			.sorted(Comparator.comparing(Product::getPrice))
			.iterator();
}

}
