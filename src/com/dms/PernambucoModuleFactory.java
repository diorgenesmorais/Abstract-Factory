package com.dms;

import java.math.BigDecimal;
import java.util.Date;

import com.dms.estados.PE;

/**
 * Sabe como criar uma Nota Fiscal de Pernambuco
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public class PernambucoModuleFactory implements ModuleFactory {

	@Override
	public NotaFiscal criarNotaFiscal() {
		return new NFe(1, new Date(), new PE(), new BigDecimal(1000.0));
	}

}
