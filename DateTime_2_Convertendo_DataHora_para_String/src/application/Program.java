package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-04-03");
		LocalDate d05 = LocalDate.parse("2022-04-03T01:34:31");
		Instant d06 = Instant.parse("2022-04-03T01:34:31Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println(d04.format(fmt1));
		System.out.println(fmt1.format(d04));
		System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));

		System.out.println(d05.format(fmt2));
	
	}

}
