package com.dms.factory;

import java.math.BigDecimal;
import java.util.Date;

import com.dms.ModuleFactory;
import com.dms.NFe;
import com.dms.NotaFiscal;
import com.dms.estados.SP;

public class SaoPauloModuleFactory implements ModuleFactory {

	@Override
	public NotaFiscal criarNotaFiscal() {
		return new NFe(4, new Date(), new SP(), new BigDecimal(1000.0));
	}

}
