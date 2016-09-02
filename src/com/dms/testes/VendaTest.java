package com.dms.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dms.ModuleFactory;
import com.dms.Venda;
import com.dms.factory.PernambucoModuleFactory;
import com.dms.factory.SaoPauloModuleFactory;

public class VendaTest {

	private Venda venda;
	ModuleFactory factory;

	@Test
	public void deveCalcularImpostoDePernambuco() {
		factory = new PernambucoModuleFactory();
		venda = new Venda(factory);

		assertEquals(1180.0, venda.getTotalDaNota().doubleValue(), 0.005);
	}

	@Test
	public void deveCalcularImpostoDeSaoPaulo() throws Exception {
		factory = new SaoPauloModuleFactory();
		venda = new Venda(factory);

		assertEquals(1070.0, venda.getTotalDaNota().doubleValue(), 0.005);
	}
}
