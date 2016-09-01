package com.dms.estados;

/**
 * Está classe representa o estado de Pernambuco.
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public class PE implements Estado {

	@Override
	public UfBrasil getUf() {
		return UfBrasil.PE;
	}

	@Override
	public double getPercentualImposto() {
		return 0.18;
	}

}
