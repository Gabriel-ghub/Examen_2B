package examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class HoraTest {
	Hora h1 = new Hora();
	@Test
	public void test1() {
		assertFalse(Hora.validarHora(10, 10, -1));
	}
	@Test
	public void test2() {
		assertFalse(Hora.validarHora(10, -1, 2));
	}
	@Test
	public void test3() {
		assertFalse(Hora.validarHora(-1, 2, 2));
	}
	@Test
	public void test4() {
		assertFalse(Hora.validarHora(10, 2, 25));
	}

}
