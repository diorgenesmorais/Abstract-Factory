package com.dms;

import java.math.BigDecimal;
import java.util.Date;

public interface NotaFiscal {

	public Integer getNumero();

	public Date getDataEmissao();

	public BigDecimal getTotalProduto();

	/**
	 * Obter o total de imposto desta nota.
	 * 
	 * @return valor total de imposto em {@code BigDecimal}.
	 */
	public BigDecimal getTotalImposto();

	/**
	 * Obter o valor total geral desta nota, ou seja, valor total dos produtos +
	 * total de imposto.
	 * 
	 * @return valor total da nota em {@code BigDecimal}.
	 */
	public BigDecimal getTotalGeral();
}
