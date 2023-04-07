package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program3 {

	public static void main(String[] args) {

		// Converter data-hora global para local
		
		LocalDate d04 = LocalDate.parse("2022-04-03");
		LocalDateTime d05 = LocalDateTime.parse("2022-04-03T01:34:31");
		Instant d06 = Instant.parse("2022-04-03T01:34:31Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		// Obter dados de uma data-hora local
		System.out.println(d04.getDayOfMonth()); // mostra o dia
		System.out.println(d04.getMonthValue()); // mostra o mês
		System.out.println(d04.getYear()); // mostra o ano
		
		System.out.println(d05.getHour()); // mostra a hora
		System.out.println(d05.getMinute()); // mostra os minutos
		System.out.println(d05.getSecond()); // mostra os segundos
	}

}
