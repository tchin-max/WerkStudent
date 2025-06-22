package test;

import java.util.Objects;

import org.junit.Test;

enum TaxClass{
	FULL(0.19),REDUCED(0.07);

	private final double taxt;
	private TaxClass(double taxt) {
this.taxt = taxt;
	}
	public double getTaxt() {
		return taxt;
	}
}


public final class ShoppingListItem {
	public String name ;
	public double Nettopreis;
	public TaxClass t;
	public ShoppingListItem(String name, double nettopreis, TaxClass t) {
		super();
		this.name = name;
		Nettopreis = nettopreis;
		this.t = t;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNettopreis() {
		return Nettopreis;
	}
	public void setNettopreis(double nettopreis) {
		Nettopreis = nettopreis;
	}
	public TaxClass getT() {
		return t;
	}
	public void setT(TaxClass t) {
		this.t = t;
	}
	private double getPriceWithTax(double Bruttopreis) {
		   Bruttopreis =  Nettopreis * (1+t.getTaxt());
		 return Math.round(Bruttopreis*100)/100;
		 	
	}

	
	public boolean equals(ShoppingListItem item) {
		if (this == item)
			return true;
		if (item == null)
			return false;
		if (getClass() != item.getClass())
			return false;
		ShoppingListItem other = (ShoppingListItem) item;
		return Double.doubleToLongBits(Nettopreis) == Double.doubleToLongBits(other.Nettopreis)
				&& Objects.equals(name, other.name) && t == other.t;
	}
	@Override
	public String toString() {
		return "ShoppingListItem [name=" + name + ", Nettopreis=" + Nettopreis + ", t=" + t + "]";
	}
	

}
 class ShoppingList{
	class Node{
		ShoppingListItem sli;
		Node next;
		public Node(ShoppingListItem sli) {
			this.sli = sli;
		}

	}
	private  Node head;
	public ShoppingList(Node head) {
this.head  =head;
	}
	public  void addElement(ShoppingListItem sli) {
		
		Node n = new Node(sli);
		if (head == null) {
			head= n;
			
		}else {
			Node curr = head;
			while (curr != null) {
				curr = curr.next;
			}
			curr.next= n;
			curr=n;
		}

		
	}
}

class Shop{
	

	
}
