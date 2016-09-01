package com.dms.estados;

/**
 * Está classe representa o estado de Sergipe
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public class SE implements Estado {

	@Override
	public UfBrasil getUf() {
		return UfBrasil.SE;
	}

	@Override
	public double getPercentualImposto() {
		return 0.12;
	}

}
