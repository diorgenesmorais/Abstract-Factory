package com.dms;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.dms.estados.Estado;

/**
 * Está classe representa uma nota fiscal eletrônica simplificada
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public class NFe implements Serializable {

	private static final long serialVersionUID = -8537220453744543467L;

	private Integer numero;
	private Date data;
	private Estado estado;
	private BigDecimal valorTotalProdutos;

	public NFe() {
		this.setNumero(this.getNumeroDaNota());
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public BigDecimal getValorTotalProdutos() {
		return valorTotalProdutos;
	}

	public void setValorTotalProdutos(BigDecimal valorTotalProdutos) {
		this.valorTotalProdutos = valorTotalProdutos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NFe other = (NFe) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	private Integer getNumeroDaNota() {
		return (int) (Math.random() * 9) + 1;
	}

	/**
	 * Obter o total de imposto desta nota.
	 * 
	 * @return valor {@code double} total de imposto.
	 */
	public double getTotalDeImposto() {
		return getValorTotalProdutos().doubleValue() * estado.getPercentualImposto();
	}

	/**
	 * Obter o valor total desta nota, ou seja, valor total dos produtos + total
	 * de imposto.
	 * 
	 * @return valor {@code double} total da nota.
	 */
	public double getTotalDaNota() {
		return getValorTotalProdutos().add(new BigDecimal(getTotalDeImposto())).doubleValue();
	}

}
