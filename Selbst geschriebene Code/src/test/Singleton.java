package test;

public class Singleton {
	private static Singleton instance;
	private String Data;
	
	private Singleton(String Data) {
	this.Data = Data;
	}

	public static Singleton getinstance(String Data) {
		if (instance==null) {
			instance= new Singleton(Data);
		}
		return instance;
	}
	
	@Override
	public String toString() {
		return "Singleton [Data=" + Data + "]";
	}

	public static void main(String[] args) {
	System.out.println(	Singleton.getinstance("yo"));
	}
}
