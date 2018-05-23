package intermedio;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class UsandoLocalDateTime {

	public static void main(String[] args) {
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		System.out.println(ahora.format(formateador));
		
		System.out.println("GMT: " + ZonedDateTime.now(ZoneId.of("GMT0")).format(formateador) );
		System.out.println("India: " + ZonedDateTime.now(ZoneId.of("Asia/Kolkata")).format(formateador));
		System.out.println("UTC: " + ZonedDateTime.now(ZoneId.of("UTC")).format(formateador) );
		
		System.out.println("----- Todas las zonas horarias -----");
		for(String zona :ZoneId.getAvailableZoneIds()) {
			System.out.println(zona);
		} 
		
	}

}
