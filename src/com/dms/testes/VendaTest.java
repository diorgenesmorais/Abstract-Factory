package com.dms.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dms.ModuleFactory;
import com.dms.PernambucoModuleFactory;
import com.dms.Venda;

public class VendaTest {

	private Venda venda;

	@Before
	public void init() {
		ModuleFactory factory = new PernambucoModuleFactory();
		venda = new Venda(factory);
	}

	@Test
	public void deveCalcularImposto() {

		assertEquals(1180.0, venda.getTotalDaNota().doubleValue(), 0.005);
	}

}
