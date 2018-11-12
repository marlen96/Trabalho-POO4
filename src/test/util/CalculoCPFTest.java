package test.util;
import static org.junit.Assert.*;

import org.junit.Test;

import util.CalculoCPF;

public class CalculoCPFTest {

	@Test
	public void certoTest() {
		CalculoCPF cpf = new CalculoCPF();
		assertEquals(true, cpf.calcular("03175334601"));	
	}
	
	@Test
	public void numeroMaiorTest() {
		CalculoCPF cpf = new CalculoCPF();
		assertEquals(false, cpf.calcular("0317533460132"));
	}
	
	@Test
	public void verificarSiglasTest() {
		CalculoCPF cpf = new CalculoCPF();
		assertEquals(false, cpf.calcular("00000000000"));
	}
	
	
	@Test
	public void erradoTest() {
		CalculoCPF cpf = new CalculoCPF();
		assertEquals(false, cpf.calcular("03175334602"));	
	}
	
	@Test
	public void semNadaTest(){
		CalculoCPF cpf = new CalculoCPF();
		assertEquals(false, cpf.calcular(""));
		
	}

	
	@Test
	public void nullTest(){
		CalculoCPF cpf = new CalculoCPF();
		assertEquals(false, cpf.calcular(null));
		
	}


}
