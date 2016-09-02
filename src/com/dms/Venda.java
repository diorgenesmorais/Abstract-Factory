package com.dms;

import java.math.BigDecimal;

public class Venda {

	private NotaFiscal nf;

	public Venda(ModuleFactory factory) {
		nf = factory.criarNotaFiscal();
	}

	/**
	 * Obter o valor Total da nota.
	 * 
	 * @return valor {@code BigDecimal} total da nota.
	 */
	public BigDecimal getTotalDaNota() {
		return nf.getTotalGeral();
	}
}
