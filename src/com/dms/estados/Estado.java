package com.dms.estados;

/**
 * Um estado brasileiro
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public interface Estado {

	/**
	 * Obter a Unidade da Federação.
	 * 
	 * @return UF {@code UfBrasil} Unidade da Federação.
	 */
	public UfBrasil getUf();

	/**
	 * Obter o Percentual do Imposto.
	 * 
	 * @return Percentual do Imposto em {@code double}.
	 */
	public double getPercentualImposto();
}
