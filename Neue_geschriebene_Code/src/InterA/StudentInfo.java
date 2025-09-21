package InterA;

public interface StudentInfo {
	/**
	 * @return Alle Vornamen des Klausurteilnehmers in einem String
	 */
	public String firstNames();
	
	/**
	 * @return Alle Nachnamen des Klausurteilnehmers in einem String
	 */
	public String lastName();
	
	/**
	 * @return Die Matrikelnummer des Klausurteilnehmers
	 */
	public int matriculationNumber();
}
