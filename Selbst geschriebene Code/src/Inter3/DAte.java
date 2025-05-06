package Inter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.chrono.ChronoLocalDateTime;

public class DAte {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2023, Month.APRIL, 25);
		System.out.println(date);
		
		LocalDateTime ldt = LocalDateTime.now();
	}

}
