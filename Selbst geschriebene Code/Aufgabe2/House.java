package Aufgabe2;

public class House {
	
	private byte floors;
	private byte doors;
	private byte windows;
	
	
	public  House(byte Stockwerke, byte Türen, byte Fernster) {
		floors= Stockwerke;
		doors=Türen ;
		windows= Fernster;
		
		
	}
	
	public  String getDescription() {
		
		String House =("Ein Haus mit "+floors +" Stockwerken, "+windows +" Fenstern und "+doors +" Türen");
		return House;
	}
	
	public static void main(String[] args) {
		House house1=new House ((byte)2,(byte)3, (byte)5);
		String houseInfo = house1.getDescription();
		System.out.println(houseInfo);
	}

}
