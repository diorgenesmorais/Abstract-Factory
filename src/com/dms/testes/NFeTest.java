package com.dms.testes;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.dms.NFe;
import com.dms.estados.PE;
import com.dms.estados.SP;

public class NFeTest {

	private NFe notaFiscal;

	@Before
	public void upSet() {
		notaFiscal = new NFe();
	}

	@Test
	public void deveGerarUmaNotaFiscalComNumeroEntre_1_e_10() throws Exception {
		Integer numero = notaFiscal.getNumero();
		System.out.println("Número da nota: " + numero);
		if (numero < 1 || numero > 10) {
			throw new Exception("Numero da nota fiscal não consta entre 1 e 10");
		}
	}

	@Test
	public void deveObterOValorDoImpostoDaNota() throws Exception {
		notaFiscal.setEstado(new SP());
		notaFiscal.setValorTotalProdutos(new BigDecimal(1000.00));
		System.out.println("Imposto do estado de: " + notaFiscal.getEstado().getUf().getEstado());
		assertEquals(70.0, notaFiscal.getTotalDeImposto(), 0.005);
	}

	@Test
	public void deveCalcularImpostoDaNotaFiscal() {
		notaFiscal.setEstado(new PE());
		notaFiscal.setValorTotalProdutos(new BigDecimal(1000.00));
		System.out.println("Imposto do estado de: " + notaFiscal.getEstado().getUf().getEstado());
		assertEquals(1180.0, notaFiscal.getTotalDaNota(), 0.005);
	}

}
