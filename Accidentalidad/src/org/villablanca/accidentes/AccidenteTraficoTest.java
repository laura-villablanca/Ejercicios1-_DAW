package org.villablanca.accidentes;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

import org.junit.jupiter.api.Test;

class AccidenteTraficoTest {

	@Test
	void testFecha() {
		LocalDate hoy = LocalDate.of(2023, 5, 4);
		AccidenteTrafico accidente = new AccidenteTrafico();
		accidente.setFecha("04/05/2023");
		assertEquals(hoy, accidente.getFecha());
		assertThrows(DateTimeParseException.class,
				() -> {accidente.setFecha("04-05-2023");
				});
	}
	
	@Test
	void testFechaConString() {
		LocalDate hoy = LocalDate.of(2023, 5, 4);
		AccidenteTrafico accidente = new AccidenteTrafico();
		accidente.setFecha("04/05/2023");
		assertEquals(hoy, accidente.getFecha());
	}
	
	@Test
	void testSetHora() {
		LocalTime hora = LocalTime.of(15,3,5);
		AccidenteTrafico accidente = new AccidenteTrafico();
		accidente.setHora("15:03:05");
		assertEquals(hora, accidente.getHora());
	}

}
