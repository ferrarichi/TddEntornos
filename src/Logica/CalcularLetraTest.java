package Logica;

import org.junit.Test;

import static org.junit.Assert.*;
public class CalcularLetraTest {
	@Test
	 public void devolverLetra(){
	  CalcularLetra c = new CalcularLetra("12345678");
	  assertEquals('J',c.devolverLetra());
	 }
}
