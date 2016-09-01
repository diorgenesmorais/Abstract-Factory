package com.dms.estados;

/**
 * Está classe representa o estado de São Paulo
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public class SP implements Estado {

	@Override
	public UfBrasil getUf() {
		return UfBrasil.SP;
	}

	@Override
	public double getPercentualImposto() {
		return 0.07;
	}

}
