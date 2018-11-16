package test.model;

import static org.junit.Assert.*;

import org.junit.Test;

import model.EstadoCivilEnum;

public class EstadoCivilEnumTest {

	@Test
	public void estadoCivilFromIntTest() {
		assertEquals(EstadoCivilEnum.Casado, EstadoCivilEnum.fromInt(1));
		assertEquals(EstadoCivilEnum.Solteiro, EstadoCivilEnum.fromInt(0));
		assertEquals(EstadoCivilEnum.Viuvo, EstadoCivilEnum.fromInt(2));
		assertEquals(null, EstadoCivilEnum.fromInt(4));
		assertEquals(null, EstadoCivilEnum.fromInt(null));
	}
	
	@Test
	public void estadoCivilToIntTest() {
		assertEquals(EstadoCivilEnum.Casado.toInt() , EstadoCivilEnum.Casado.toInt());
	}

	@Test
	public void estadoCivilToStringTest() {
		assertEquals("Casado", EstadoCivilEnum.Casado.toString());
		assertEquals("Solteiro", EstadoCivilEnum.Solteiro.toString());
		assertEquals("Viuvo", EstadoCivilEnum.Viuvo.toString());
	}
}
