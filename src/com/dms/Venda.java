package com.dms;

import java.math.BigDecimal;

public class Venda {

	private NotaFiscal nf;
	
	public Venda(ModuleFactory factory){
		nf = factory.criarNotaFiscal();
	}
	
	public BigDecimal getTotalDaNota(){
		return nf.getTotalGeral();
	}
}
