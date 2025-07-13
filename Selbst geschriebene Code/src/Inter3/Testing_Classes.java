package Inter3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Testing_Classes {
	private Calculator calc;
	private CalculatorNumber n1;
	private CalculatorNumber n2;

	
@BeforeEach
public void setUpInstanz() {
	calc = new Calculator();
	n1 = new CalculatorNumber(5);
	n2 = new CalculatorNumber(9);
calc.getReady();
}

	@Test
	void Addition() {
	//CalculatorNumber result = calc.add(n1, n2);
	}

}
